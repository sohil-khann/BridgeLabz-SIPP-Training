import java.util.Scanner;

public class MultiplesBelowHundredFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else if (number >= 100) {
            System.out.println("Please enter a number less than 100 to find its multiples below 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100 are: ");
            for (int i = number; i < 100; i += number) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}