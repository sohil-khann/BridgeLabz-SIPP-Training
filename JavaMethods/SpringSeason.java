public class SpringSeason {

    public static boolean isSpringSeason(int month, int day) {
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            return false; // Invalid date
        }
        if (month == 3) {
            return day >= 20 && day <= 31;
        } else if (month == 4 || month == 5) {
            return day >= 1 && day <= (month == 4 ? 30 : 31); // April has 30 days, May has 31
        } else if (month == 6) {
            return day >= 1 && day <= 20;
        }
        return false;
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java SpringSeason <month> <day>");
            return;
        }

        try {
            int month = Integer.parseInt(args[0]);
            int day = Integer.parseInt(args[1]);

            if (isSpringSeason(month, day)) {
                System.out.println("It's a Spring Season");
            } else {
                System.out.println("Not a Spring Season");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Month and day must be integers.");
        }
    }
}