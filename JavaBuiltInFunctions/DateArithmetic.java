import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDate inputDate = null;
        while (inputDate == null) {
            System.out.print("Enter a date (yyyy-MM-dd): ");
            String dateString = scanner.nextLine();
            try {
                inputDate = LocalDate.parse(dateString);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please use yyyy-MM-dd.");
            }
        }

        // Add 7 days, 1 month, and 2 years
        LocalDate resultDate = inputDate.plusDays(7).plusMonths(1).plusYears(2);
        System.out.println("Date after adding 7 days, 1 month, 2 years: " + resultDate);

        // Subtract 3 weeks
        resultDate = resultDate.minusWeeks(3);
        System.out.println("Date after subtracting 3 weeks: " + resultDate);

        scanner.close();
    }
}