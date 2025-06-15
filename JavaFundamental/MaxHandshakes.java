import java.util.Scanner;

public class MaxHandshakes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        if (numberOfStudents < 0) {
            System.out.println("Number of students cannot be negative.");
        } else if (numberOfStudents == 0 || numberOfStudents == 1) {
            System.out.println("The number of possible handshakes is 0");
        } else {
            long maxHandshakes = (long)numberOfStudents * (numberOfStudents - 1) / 2;
            System.out.println("The number of possible handshakes is " + maxHandshakes);
        }

        scanner.close();
    }
}