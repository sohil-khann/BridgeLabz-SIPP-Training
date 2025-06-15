import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Rate of Interest (per annum): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Time period (in years): ");
        double time = scanner.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("The Simple Interest is " + String.format("%.2f", simpleInterest) + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);

        scanner.close();
    }
}