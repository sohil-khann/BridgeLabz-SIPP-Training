import java.util.Scanner;

public class PowerOfNumberWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the power: ");
        int power = scanner.nextInt();

        long result = 1;
        int counter = 0;

        if (power < 0) {
            System.out.println("Power cannot be negative for this simple calculation.");
        } else if (power == 0) {
            System.out.println(number + " raised to the power of " + power + " is: " + result);
        } else {
            while (counter < power) {
                result *= number;
                counter++;
            }
            System.out.println(number + " raised to the power of " + power + " is: " + result);
        }

        scanner.close();
    }
}