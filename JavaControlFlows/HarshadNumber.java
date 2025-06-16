import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int sum = 0;
        int originalNumber = number; // Store the original number for the final check

        // Calculate the sum of digits
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        // Check if the original number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number.");
        }

        scanner.close();
    }
}