import java.util.Scanner;

public class ParkRounds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of side 1 of the triangular park (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side 2 of the triangular park (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side 3 of the triangular park (in meters): ");
        double side3 = scanner.nextDouble();

        double perimeterMeters = side1 + side2 + side3;
        double targetDistanceMeters = 5 * 1000; // 5 km in meters

        double numberOfRounds = targetDistanceMeters / perimeterMeters;

        System.out.println("The total number of rounds the athlete will run is " + String.format("%.2f", numberOfRounds) + " to complete 5 km");

        scanner.close();
    }
}