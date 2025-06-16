import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month (as a number, e.g., 3 for March): ");
        int month = scanner.nextInt();

        System.out.print("Enter the day: ");
        int day = scanner.nextInt();

        boolean isSpring = false;

        if (month == 3) {
            if (day >= 20 && day <= 31) {
                isSpring = true;
            }
        } else if (month == 4) {
            if (day >= 1 && day <= 30) {
                isSpring = true;
            }
        } else if (month == 5) {
            if (day >= 1 && day <= 31) {
                isSpring = true;
            }
        } else if (month == 6) {
            if (day >= 1 && day <= 20) {
                isSpring = true;
            }
        }

        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

        scanner.close();
    }
}