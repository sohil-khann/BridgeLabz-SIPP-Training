import java.util.Scanner;

public class PowerOfNumberFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the power: ");
        int power = scanner.nextInt();

        long result = 1;

        if (power < 0) {
            System.out.println("Power cannot be negative for this simple calculation.");
        } else {
            for (int i = 1; i <= power; i++) {
                result *= number;
            }
            System.out.println(number + " raised to the power of " + power + " is: " + result);
        }

        scanner.close();
    }
}