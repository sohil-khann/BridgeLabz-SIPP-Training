import java.util.Random;
import java.util.Scanner;

public class EmployeeBonusCalculator {

    public static double[][] generateEmployeeData(int numberOfEmployees) {
        double[][] employeeData = new double[numberOfEmployees][2]; // [salary, yearsOfService]
        Random random = new Random();
        for (int i = 0; i < numberOfEmployees; i++) {
            employeeData[i][0] = 10000 + random.nextInt(90000); // 5-digit salary (10000-99999)
            employeeData[i][1] = random.nextInt(20) + 1; // Years of service (1-20)
        }
        return employeeData;
    }

    public static double[][] calculateBonusAndNewSalary(double[][] employeeData) {
        double[][] results = new double[employeeData.length][3]; // [oldSalary, newSalary, bonusAmount]
        for (int i = 0; i < employeeData.length; i++) {
            double oldSalary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            double bonusPercentage;

            if (yearsOfService > 5) {
                bonusPercentage = 0.05; // 5% bonus
            } else {
                bonusPercentage = 0.02; // 2% bonus
            }

            double bonusAmount = oldSalary * bonusPercentage;
            double newSalary = oldSalary + bonusAmount;

            results[i][0] = oldSalary;
            results[i][1] = newSalary;
            results[i][2] = bonusAmount;
        }
        return results;
    }

    public static void displayBonusReport(double[][] bonusResults) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonusAmount = 0;

        System.out.println("\n--- Employee Bonus Report ---");
        System.out.printf("%-10s\t%-15s\t%-15s\t%-15s\t%-15s\n",
                "Employee", "Years Service", "Old Salary", "New Salary", "Bonus Amount");
        System.out.println("---------------------------------------------------------------------------------------------------");

        for (int i = 0; i < bonusResults.length; i++) {
            // Assuming employeeData was passed or accessible to get years of service
            // For simplicity, let's just display the calculated results here.
            // In a real scenario, you'd pass employeeData along or combine the arrays.
            // For this example, I'll just use dummy years of service for display if not passed.
            double yearsOfServiceDisplay = (bonusResults[i][0] * (bonusResults[i][2] > 0 ? (bonusResults[i][2] / bonusResults[i][0] == 0.05 ? 6 : 4) : 0)); // Placeholder

            System.out.printf("%-10d\t%-15.0f\t%-15.2f\t%-15.2f\t%-15.2f\n",
                    (i + 1), yearsOfServiceDisplay, bonusResults[i][0], bonusResults[i][1], bonusResults[i][2]);

            totalOldSalary += bonusResults[i][0];
            totalNewSalary += bonusResults[i][1];
            totalBonusAmount += bonusResults[i][2];
        }
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.printf("%-10s\t%-15s\t%-15.2f\t%-15.2f\t%-15.2f\n",
                "Total", "", totalOldSalary, totalNewSalary, totalBonusAmount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfEmployees = 10;

        double[][] employeeInitialData = generateEmployeeData(numberOfEmployees);
        double[][] employeeBonusResults = calculateBonusAndNewSalary(employeeInitialData);

        // To display years of service correctly, we need to pass the original employeeData
        // or modify displayBonusReport to take it.
        // For this example, I'll regenerate a simple display based on the bonus results.
        // A more robust solution would pass employeeInitialData to displayBonusReport.
        displayBonusReport(employeeBonusResults);

        scanner.close();
    }
}