import java.util.Scanner;

public class MultiplesBelowHundredWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else if (number >= 100) {
            System.out.println("Please enter a number less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100 are: ");
            int multiple = number;
            while (multiple < 100) {
                System.out.print(multiple + " ");
                multiple += number;
            }
            System.out.println();
        }
        scanner.close();
    }
}