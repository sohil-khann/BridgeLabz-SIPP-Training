import java.util.Scanner;

public class RocketCountdownWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the countdown start number: ");
        int counter = scanner.nextInt();

        if (counter <= 0) {
            System.out.println("Please enter a positive number for the countdown.");
        } else {
            System.out.println("Countdown initiated:");
            while (counter >= 1) {
                System.out.println(counter);
                counter--;
            }
            System.out.println("Liftoff!");
        }

        scanner.close();
    }
}