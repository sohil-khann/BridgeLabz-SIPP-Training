import java.util.Scanner;

public class TrigonometricFunctions {

    public static double[] calculateTrigonometricFunctions(double angleInDegrees) {
        double angleInRadians = Math.toRadians(angleInDegrees);
        double sine = Math.sin(angleInRadians);
        double cosine = Math.cos(angleInRadians);
        double tangent = Math.tan(angleInRadians);
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an angle in degrees: ");
        double angle = scanner.nextDouble();

        double[] results = calculateTrigonometricFunctions(angle);

        System.out.printf("For angle %.2f degrees:%n", angle);
        System.out.printf("  Sine:   %.4f%n", results[0]);
        System.out.printf("  Cosine: %.4f%n", results[1]);
        System.out.printf("  Tangent: %.4f%n", results[2]);

        scanner.close();
    }
}