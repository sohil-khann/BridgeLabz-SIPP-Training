import java.util.Scanner;
public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(), b = input.nextInt();
        int q = a / b, r = a % b;
        System.out.println("The Quotient is " + q + " and Reminder is " + r + " of two number " + a + " and " + b);
    }
}