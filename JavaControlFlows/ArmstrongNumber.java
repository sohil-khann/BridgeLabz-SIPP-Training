import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int sum = 0;
        int remainder;

        while (originalNumber != 0) {
            
            remainder = originalNumber % 10;
           
            sum += Math.pow(remainder, 3);
       
            originalNumber /= 10;
        }

        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }
}