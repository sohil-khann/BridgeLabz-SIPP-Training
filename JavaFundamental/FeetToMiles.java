import java.util.Scanner;
public class FeetToMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int feet = input.nextInt();
        double yards = feet / 3.0;
        double miles = yards / 1760.0;
        System.out.println("The distance in yards is " + yards + " while the distance in miles is " + miles);
    }
}