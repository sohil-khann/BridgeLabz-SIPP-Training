import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        double number;

        System.out.println("Enter numbers to sum. Enter 0 to stop.");

        do {
            System.out.print("Enter a number: ");
            number = scanner.nextDouble();
            total += number;
        } while (number != 0);

        System.out.println("The sum of the entered numbers is: " + total);
        scanner.close();
    }
}