import java.util.Scanner;

public class SumNaturalNumbersForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a natural number (a positive integer).");
        } else {
            long sumFormula = (long)number * (number + 1) / 2;
            long sumLoop = 0;

            for (int i = 1; i <= number; i++) {
                sumLoop += i;
            }

            System.out.println("Sum using formula n*(n+1)/2: " + sumFormula);
            System.out.println("Sum using for loop: " + sumLoop);

            if (sumFormula == sumLoop) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("There is a discrepancy in the computations.");
            }
        }

        scanner.close();
    }
}