import java.util.Scanner;

public class ChocolateDistribution {

    public static int[] findDistribution(int numberOfChocolates, int numberOfChildren) {
        if (numberOfChildren <= 0) {
            System.out.println("Error: Number of children must be greater than zero.");
            return new int[]{0, numberOfChocolates}; // Or throw an exception
        }
        if (numberOfChocolates < 0) {
             System.out.println("Error: Number of chocolates cannot be negative.");
            return new int[]{0, 0};
        }
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        return new int[]{chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of chocolates: ");
        int chocolates = scanner.nextInt();

        System.out.print("Enter the number of children: ");
        int children = scanner.nextInt();

        int[] result = findDistribution(chocolates, children);

        if (children > 0 && chocolates >= 0) {
            System.out.println("Each child will get: " + result[0] + " chocolates.");
            System.out.println("Remaining chocolates: " + result[1]);
        }

        scanner.close();
    }
}