import java.util.Scanner;

public class WindChill {

    public static double calculateWindChill(double temperature, double windSpeed) {
        // Formula: w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * v^0.16
        // Valid for t <= 50 F and v >= 3 mph
        if (temperature > 50 || windSpeed < 3) {
            System.out.println("Formula is not applicable for the given temperature or wind speed.");
            System.out.println("Temperature must be <= 50 F and wind speed must be >= 3 mph.");
            return Double.NaN; // Not a Number, to indicate invalid input for formula
        }
        return 35.74 + (0.6215 * temperature) + ((0.4275 * temperature) - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit (must be <= 50 F): ");
        double t = scanner.nextDouble();

        System.out.print("Enter the wind speed in miles per hour (must be >= 3 mph): ");
        double v = scanner.nextDouble();

        double windChill = calculateWindChill(t, v);

        if (!Double.isNaN(windChill)) {
            System.out.printf("The wind chill temperature is: %.2f F%n", windChill);
        }

        scanner.close();
    }
}