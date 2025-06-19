import java.util.Scanner;

public class SumNaturalNumbers {

    public static long sumRecursive(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sumRecursive(n - 1);
    }

    public static long sumFormula(int n) {
        if (n <= 0) {
            return 0;
        }
        return (long)n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number (n > 0): ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive natural number.");
        } else {
            long recursiveResult = sumRecursive(number);
            long formulaResult = sumFormula(number);

            System.out.println("Sum using recursion: " + recursiveResult);
            System.out.println("Sum using formula n(n+1)/2: " + formulaResult);

            if (recursiveResult == formulaResult) {
                System.out.println("Both methods produced the same result.");
            } else {
                System.out.println("The results from the two methods are different (this should not happen for valid n).");
            }
        }

        scanner.close();
    }
}