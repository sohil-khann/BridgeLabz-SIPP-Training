import java.util.Random;
import java.util.Scanner;

public class StudentScorecard {

    public static int[][] generateRandomScores(int numberOfStudents) {
        int[][] scores = new int[numberOfStudents][3]; // 3 subjects: Physics, Chemistry, Math
        Random random = new Random();
        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 10 + random.nextInt(90); // Random 2-digit score (10-99)
            }
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3]; // total, average, percentage
        for (int i = 0; i < scores.length; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            results[i][0] = total; // Total
            results[i][1] = Math.round((double) total / 3 * 100.0) / 100.0; // Average rounded to 2 decimal places
            results[i][2] = Math.round((double) total / 300 * 100 * 100.0) / 100.0; // Percentage rounded to 2 decimal places
        }
        return results;
    }

    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("\n--- Student Scorecard ---");
        System.out.printf("%-10s\t%-8s\t%-8s\t%-8s\t%-8s\t%-8s\t%-8s\n",
                "Student", "Physics", "Chem", "Math", "Total", "Average", "Percent");
        System.out.println("--------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d\t%-8d\t%-8d\t%-8d\t%-8.0f\t%-8.2f\t%-8.2f\n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        int[][] studentScores = generateRandomScores(numberOfStudents);
        double[][] studentResults = calculateResults(studentScores);

        displayScorecard(studentScores, studentResults);

        scanner.close();
    }
}