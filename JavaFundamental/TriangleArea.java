import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble(), height = input.nextDouble();
        double areaCm = 0.5 * base * height;
        double areaInch = areaCm / (2.54 * 2.54);
        System.out.println("The Area of the triangle in sq in is " + areaInch + " and sq cm is " + areaCm);
    }
}