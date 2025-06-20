import java.util.Scanner;

public class SpecialNumberChecker {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == number;
    }

    public static boolean isSpyNumber(int number) {
        int sumOfDigits = 0;
        int productOfDigits = 1;
        int tempNumber = number;

        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            sumOfDigits += digit;
            productOfDigits *= digit;
            tempNumber /= 10;
        }
        return sumOfDigits == productOfDigits;
    }

    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        String numStr = String.valueOf(number);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }

    public static boolean isBuzzNumber(int number) {
        return (number % 7 == 0 || number % 10 == 7);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check its properties: ");
        int num = scanner.nextInt();

        System.out.println("Is " + num + " Prime? " + isPrime(num));
        System.out.println("Is " + num + " Neon Number? " + isNeonNumber(num));
        System.out.println("Is " + num + " Spy Number? " + isSpyNumber(num));
        System.out.println("Is " + num + " Automorphic Number? " + isAutomorphicNumber(num));
        System.out.println("Is " + num + " Buzz Number? " + isBuzzNumber(num));

        scanner.close();
    }
}