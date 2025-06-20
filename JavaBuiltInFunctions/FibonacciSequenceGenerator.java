import java.util.Scanner;

public class FibonacciSequenceGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms for Fibonacci sequence: ");
        int numTerms = scanner.nextInt();

        generateFibonacci(numTerms);

        scanner.close();
    }

    public static void generateFibonacci(int numTerms) {
        if (numTerms <= 0) {
            System.out.println("Number of terms must be positive.");
            return;
        }

        long a = 0, b = 1;
        System.out.print("Fibonacci Sequence: ");

        if (numTerms >= 1) {
            System.out.print(a);
        }
        if (numTerms >= 2) {
            System.out.print(", " + b);
        }

        for (int i = 3; i <= numTerms; i++) {
            long next = a + b;
            System.out.print(", " + next);
            a = b;
            b = next;
        }
        System.out.println();
    }
}