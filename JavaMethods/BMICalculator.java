import java.util.Scanner;

public class BMICalculator {

    public static double[][] calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weightKg = data[i][0];
            double heightCm = data[i][1];
            if (heightCm > 0) { // Avoid division by zero
                double heightM = heightCm / 100.0; // Convert cm to meters
                data[i][2] = weightKg / (heightM * heightM);
            } else {
                data[i][2] = 0; // Or some indicator of invalid height
            }
        }
        return data;
    }

    public static String[] getBMIStatus(double[][] data) {
        String[] statuses = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 0) {
                statuses[i] = "Invalid Data";
            } else if (bmi < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmi < 25) {
                statuses[i] = "Normal weight";
            } else if (bmi < 30) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }
        return statuses;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfMembers = 10;
        double[][] teamData = new double[numberOfMembers][3]; // [weight, height, bmi]

        System.out.println("Enter weight (kg) and height (cm) for " + numberOfMembers + " team members:");
        for (int i = 0; i < numberOfMembers; i++) {
            System.out.println("\nMember " + (i + 1) + ":");
            System.out.print("Enter weight (kg): ");
            teamData[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm): ");
            teamData[i][1] = scanner.nextDouble();
        }

        teamData = calculateBMI(teamData);
        String[] bmiStatuses = getBMIStatus(teamData);

        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s | %-12s | %-12s | %-8s | %-15s\n", "Member", "Weight (kg)", "Height (cm)", "BMI", "Status");
        System.out.println("----------------------------------------------------------------------");
        for (int i = 0; i < numberOfMembers; i++) {
            System.out.printf("%-10d | %-12.2f | %-12.2f | %-8.2f | %-15s\n",
                    (i + 1), teamData[i][0], teamData[i][1], teamData[i][2], bmiStatuses[i]);
        }

        scanner.close();
    }
}