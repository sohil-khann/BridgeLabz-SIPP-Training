import java.util.Scanner;

public class NumberAnalysis {

    public boolean isPositive(int number) {
        return number > 0;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int compareNumbers(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 < num2) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberAnalysis analyzer = new NumberAnalysis();
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\nNumber Analysis:");
        for (int number : numbers) {
            if (analyzer.isPositive(number)) {
                System.out.print("Number " + number + " is positive and ");
                if (analyzer.isEven(number)) {
                    System.out.println("even.");
                } else {
                    System.out.println("odd.");
                }
            } else if (number == 0) {
                 System.out.println("Number " + number + " is zero.");
            } else {
                System.out.println("Number " + number + " is negative.");
            }
        }

        int comparisonResult = analyzer.compareNumbers(numbers[0], numbers[4]);
        System.out.print("\nComparison of first (" + numbers[0] + ") and last (" + numbers[4] + ") elements: ");
        if (comparisonResult == 1) {
            System.out.println("First element is greater.");
        } else if (comparisonResult == -1) {
            System.out.println("Last element is greater.");
        } else {
            System.out.println("Elements are equal.");
        }

        scanner.close();
    }
}