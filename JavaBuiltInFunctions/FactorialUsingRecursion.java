import java.util.Scanner;

public class FactorialUsingRecursion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = getInput(scanner);
        long factorial = calculateFactorial(number);
        displayResult(number, factorial);

        scanner.close();
    }

    public static int getInput(Scanner scanner) {
        System.out.print("Enter a non-negative integer to calculate its factorial: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer:");
            scanner.next();
        }
        int num = scanner.nextInt();
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers. Please enter a non-negative integer.");
            return getInput(scanner);
        }
        return num;
    }

    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    public static void displayResult(int number, long factorial) {
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}