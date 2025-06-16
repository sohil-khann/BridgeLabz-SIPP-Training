import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer greater than 1: ");
        int number = scanner.nextInt();
        boolean isPrime = true;

        // 2. Prime Numbers checks are done for numbers greater than 1
        if (number <= 1) {
            isPrime = false;
        } else {
            // 3. Loop through all the numbers from 2 to the user input number (or number/2 or Math.sqrt(number) for optimization)
            // and check if the reminder is zero.
            // If the reminder is zero break out from the loop as the number is divisible by some other number and is not a prime number.
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // 4. Use the isPrime boolean variable to store the result and finally display the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }
}