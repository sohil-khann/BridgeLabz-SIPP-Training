import java.util.Scanner;
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double f = input.nextDouble();
        double c = (f - 32) * 5/9;
        System.out.println("The " + f + " fahrenheit is " + c + " celsius");
    }
}