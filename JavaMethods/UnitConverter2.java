import java.util.Scanner;

public class UnitConverter2 {

    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unit Converter Part 2");

        System.out.print("Enter distance in Kilometers: ");
        double km = scanner.nextDouble();
        System.out.printf("%.2f km is %.2f miles%n", km, convertKmToMiles(km));

        System.out.print("Enter distance in Miles: ");
        double miles = scanner.nextDouble();
        System.out.printf("%.2f miles is %.2f km%n", miles, convertMilesToKm(miles));

        System.out.print("Enter length in Meters: ");
        double meters = scanner.nextDouble();
        System.out.printf("%.2f m is %.2f ft%n", meters, convertMetersToFeet(meters));

        System.out.print("Enter length in Feet: ");
        double feet = scanner.nextDouble();
        System.out.printf("%.2f ft is %.2f m%n", feet, convertFeetToMeters(feet));

        scanner.close();
    }
}