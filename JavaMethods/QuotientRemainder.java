import java.util.Scanner;

public class QuotientRemainder {

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        if (divisor == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return new int[]{0, 0}; // Or throw an exception
        }
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (dividend): ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number (divisor): ");
        int num2 = scanner.nextInt();

        int[] result = findRemainderAndQuotient(num1, num2);

        if (num2 != 0) { // Avoid printing if divisor was zero and error was handled
            System.out.println("Quotient: " + result[0]);
            System.out.println("Remainder: " + result[1]);
        }

        scanner.close();
    }
}