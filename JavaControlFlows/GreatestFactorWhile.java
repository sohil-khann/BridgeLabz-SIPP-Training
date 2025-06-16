import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int greatestFactor = 1;

        if (number <= 1) {
            System.out.println("There is no greatest factor other than 1 for this number.");
        } else {
            int counter = number - 1;
            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break;
                }
                counter--;
            }
            System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
        }

        scanner.close();
    }
}