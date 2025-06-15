import java.util.Scanner;
public class IntegerOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
        int r1 = a + b * c;
        int r2 = a * b + c;
        int r3 = c + a / b;
        int r4 = a % b + c;
        System.out.println("The results of Int Operations are " + r1 + ", " + r2 + ", " + r3 + ", " + r4);
    }
}