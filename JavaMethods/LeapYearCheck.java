import java.util.Scanner;

public class LeapYearCheck {

    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            System.out.println("Leap year rules apply for years >= 1582 (Gregorian calendar).");
            return false;
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();

        if (year >= 1582) { // Check here as well to avoid printing result for invalid years based on method's own check
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else if (year < 1582 && year > 0) { // If year is < 1582 but positive, isLeapYear would have printed its message.
             // No additional message needed here as isLeapYear handles it.
        } else {
            System.out.println("Invalid year input.");
        }

        scanner.close();
    }
}