import java.util.Scanner;

public class SimpleInterestCalculator {

    public static double calculateSimpleInterest(double principal, double rate, double time) {
        if (principal < 0 || rate < 0 || time < 0) {
            System.out.println("Error: Principal, rate, and time must be non-negative.");
            return 0;
        }
        return (principal * rate * time) / 100.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double p = scanner.nextDouble();

        System.out.print("Enter the annual rate of interest (e.g., 5 for 5%): ");
        double r = scanner.nextDouble();

        System.out.print("Enter the time period in years: ");
        double t = scanner.nextDouble();

        double simpleInterest = calculateSimpleInterest(p, r, t);

        if (p >= 0 && r >= 0 && t >= 0) {
            System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f%% and Time %.2f years.%n",
                    simpleInterest, p, r, t);
        }

        scanner.close();
    }
}