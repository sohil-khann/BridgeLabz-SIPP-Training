import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter your years of service: ");
        int yearsOfService = scanner.nextInt();

        double bonus = 0;

        if (yearsOfService > 5) {
            bonus = 0.05 * salary;
            System.out.println("Congratulations! You get a bonus.");
            System.out.println("Your bonus amount is: " + bonus);
        } else {
            System.out.println("You are not eligible for a bonus this year.");
        }

        scanner.close();
    }
}