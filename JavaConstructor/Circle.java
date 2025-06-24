package JavaConstructor;

public class Circle {
    double radius;

    // Default constructor
    public Circle() {
        this(1.0); // Calls the parameterized constructor with a default value
        System.out.println("Default Circle constructor called.");
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
        System.out.println("Parameterized Circle constructor called. Radius: " + radius);
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        // Create a circle using the default constructor
        Circle circle1 = new Circle();
        System.out.println("Area of circle1: " + circle1.getArea());
        System.out.println("\n");

        // Create a circle using the parameterized constructor
        Circle circle2 = new Circle(5.0);
        System.out.println("Area of circle2: " + circle2.getArea());
    }
}