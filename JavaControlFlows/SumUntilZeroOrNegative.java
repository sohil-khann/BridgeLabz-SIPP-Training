import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;

        System.out.println("Enter numbers to sum. Enter 0 or a negative number to stop.");

        while (true) {
            System.out.print("Enter a number: ");
            double number = scanner.nextDouble();

            if (number <= 0) {
                break; // Exit the loop if the number is 0 or negative
            }
            total += number;
        }

        System.out.println("The sum of the entered numbers is: " + total);
        scanner.close();
    }
}