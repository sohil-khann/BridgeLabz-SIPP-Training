import java.util.Scanner;

public class UnitConverterExtended {

    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unit Conversion Utility:");

        System.out.print("Enter value in Yards to convert to Feet: ");
        double yards = scanner.nextDouble();
        System.out.println(yards + " Yards is " + convertYardsToFeet(yards) + " Feet.");

        System.out.print("Enter value in Feet to convert to Yards: ");
        double feet = scanner.nextDouble();
        System.out.println(feet + " Feet is " + String.format("%.2f", convertFeetToYards(feet)) + " Yards.");

        System.out.print("Enter value in Meters to convert to Inches: ");
        double meters = scanner.nextDouble();
        System.out.println(meters + " Meters is " + String.format("%.2f", convertMetersToInches(meters)) + " Inches.");

        System.out.print("Enter value in Inches to convert to Meters: ");
        double inches = scanner.nextDouble();
        System.out.println(inches + " Inches is " + String.format("%.4f", convertInchesToMeters(inches)) + " Meters.");

        System.out.print("Enter value in Inches to convert to Centimeters: ");
        double inchesForCm = scanner.nextDouble();
        System.out.println(inchesForCm + " Inches is " + String.format("%.2f", convertInchesToCentimeters(inchesForCm)) + " Centimeters.");

        scanner.close();
    }
}