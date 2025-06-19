import java.util.Scanner;
import java.util.Arrays;

public class FactorAnalysis {

    public static int[] findFactors(int number) {
        if (number <= 0) {
            return new int[0]; // Return empty array for non-positive numbers
        }
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static long sumFactors(int[] factors) {
        long sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static long productFactors(int[] factors) {
        if (factors.length == 0) {
            return 0; // Or 1, depending on convention for empty product
        }
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static double sumSquareFactors(int[] factors) {
        double sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            scanner.close();
            return;
        }

        int[] factors = findFactors(number);

        System.out.println("Factors of " + number + " are: " + Arrays.toString(factors));
        System.out.println("Sum of factors: " + sumFactors(factors));
        System.out.println("Product of factors: " + productFactors(factors));
        System.out.println("Sum of squares of factors: " + sumSquareFactors(factors));

        scanner.close();
    }
}