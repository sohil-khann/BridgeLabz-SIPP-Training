import java.util.Scanner;

public class UnitConverter1 {

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unit Converter Part 1");

        System.out.print("Enter temperature in Fahrenheit: ");
        double fTemp = scanner.nextDouble();
        System.out.printf("%.2f F is %.2f C%n", fTemp, convertFahrenheitToCelsius(fTemp));

        System.out.print("Enter temperature in Celsius: ");
        double cTemp = scanner.nextDouble();
        System.out.printf("%.2f C is %.2f F%n", cTemp, convertCelsiusToFahrenheit(cTemp));

        System.out.print("Enter weight in Pounds: ");
        double pounds = scanner.nextDouble();
        System.out.printf("%.2f lbs is %.2f kg%n", pounds, convertPoundsToKilograms(pounds));

        System.out.print("Enter weight in Kilograms: ");
        double kg = scanner.nextDouble();
        System.out.printf("%.2f kg is %.2f lbs%n", kg, convertKilogramsToPounds(kg));

        System.out.print("Enter volume in Gallons: ");
        double gallons = scanner.nextDouble();
        System.out.printf("%.2f gal is %.2f L%n", gallons, convertGallonsToLiters(gallons));

        System.out.print("Enter volume in Liters: ");
        double liters = scanner.nextDouble();
        System.out.printf("%.2f L is %.2f gal%n", liters, convertLitersToGallons(liters));

        scanner.close();
    }
}