import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheitResult = (celsius * 9.0/5.0) + 32;

        System.out.println("The " + celsius + " celsius is " + String.format("%.2f", fahrenheitResult) + " fahrenheit");

        scanner.close();
    }
}