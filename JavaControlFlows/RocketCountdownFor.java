import java.util.Scanner;

public class RocketCountdownFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the countdown start number: ");
        int counter = scanner.nextInt();

        if (counter <= 0) {
            System.out.println("Please enter a positive number for the countdown.");
        } else {
            System.out.println("Countdown initiated:");
            for (int i = counter; i >= 1; i--) {
                System.out.println(i);
            }
            System.out.println("Liftoff!");
        }

        scanner.close();
    }
}