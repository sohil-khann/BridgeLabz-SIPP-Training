import java.util.Scanner;
import java.util.Arrays;

public class QuadraticEquationSolver {

    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        double[] roots;

        if (delta > 0) {
            roots = new double[2];
            roots[0] = (-b + Math.sqrt(delta)) / (2 * a);
            roots[1] = (-b - Math.sqrt(delta)) / (2 * a);
        } else if (delta == 0) {
            roots = new double[1];
            roots[0] = -b / (2 * a);
        } else {
            roots = new double[0]; // No real roots
        }
        return roots;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coefficients a, b, and c for the quadratic equation ax^2 + bx + c = 0:");
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("This is not a quadratic equation (a cannot be 0).");
            if (b != 0) {
                System.out.println("It is a linear equation with one root: x = " + (-c/b));
            } else if (c == 0) {
                 System.out.println("It is an identity 0 = 0, true for all x.");
            } else {
                 System.out.println("It is a contradiction " + c + " = 0, no solution.");
            }
            scanner.close();
            return;
        }

        double[] roots = findRoots(a, b, c);

        if (roots.length == 2) {
            System.out.println("The equation has two distinct real roots: " + roots[0] + " and " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("The equation has one real root (repeated): " + roots[0]);
        } else {
            System.out.println("The equation has no real roots.");
        }

        scanner.close();
    }
}