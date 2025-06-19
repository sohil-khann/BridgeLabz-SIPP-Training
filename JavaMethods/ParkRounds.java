import java.util.Scanner;

public class ParkRounds {

    public static double calculateRounds(double side1, double side2, double side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("Error: Triangle sides must be positive.");
            return 0;
        }
        // Check triangle inequality theorem
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            System.out.println("Error: The given sides do not form a valid triangle.");
            return 0;
        }

        double perimeter = side1 + side2 + side3; // in meters
        double targetDistance = 5000; // 5 km in meters

        if (perimeter == 0) {
            System.out.println("Error: Perimeter is zero, cannot calculate rounds.");
            return 0;
        }
        return targetDistance / perimeter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the first side of the triangular park (meters): ");
        double s1 = scanner.nextDouble();

        System.out.print("Enter the length of the second side (meters): ");
        double s2 = scanner.nextDouble();

        System.out.print("Enter the length of the third side (meters): ");
        double s3 = scanner.nextDouble();

        double rounds = calculateRounds(s1, s2, s3);

        if (rounds > 0) {
            System.out.printf("The athlete needs to complete %.2f rounds to run 5 km.%n", rounds);
        }

        scanner.close();
    }
}