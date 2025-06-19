import java.util.Scanner;

public class FriendComparison {

    // Method to find the index of the youngest friend
    public static int findYoungestFriendIndex(int[] ages) {
        if (ages == null || ages.length == 0) {
            return -1; // Invalid input
        }
        int youngestIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        return youngestIndex;
    }

    // Method to find the index of the tallest friend
    public static int findTallestFriendIndex(double[] heights) {
        if (heights == null || heights.length == 0) {
            return -1; // Invalid input
        }
        int tallestIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        return tallestIndex;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] friendNames = {"Amar", "Akbar", "Anthony"};
        int numberOfFriends = friendNames.length;
        int[] ages = new int[numberOfFriends];
        double[] heights = new double[numberOfFriends];

        System.out.println("Enter the age and height for each friend:");
        for (int i = 0; i < numberOfFriends; i++) {
            System.out.println("\nFriend: " + friendNames[i]);
            System.out.print("Enter age: ");
            ages[i] = scanner.nextInt();
            while (ages[i] <= 0) {
                System.out.print("Age must be positive. Enter age for " + friendNames[i] + ": ");
                ages[i] = scanner.nextInt();
            }
            System.out.print("Enter height (in cm): ");
            heights[i] = scanner.nextDouble();
            while (heights[i] <= 0) {
                System.out.print("Height must be positive. Enter height for " + friendNames[i] + " (in cm): ");
                heights[i] = scanner.nextDouble();
            }
        }

        int youngestIndex = findYoungestFriendIndex(ages);
        int tallestIndex = findTallestFriendIndex(heights);

        System.out.println("\n--- Comparison Results ---");
        if (youngestIndex != -1) {
            System.out.println("The youngest friend is " + friendNames[youngestIndex] + " with age " + ages[youngestIndex] + ".");
        } else {
            System.out.println("Could not determine the youngest friend.");
        }

        if (tallestIndex != -1) {
            System.out.println("The tallest friend is " + friendNames[tallestIndex] + " with height " + heights[tallestIndex] + " cm.");
        } else {
            System.out.println("Could not determine the tallest friend.");
        }

        scanner.close();
    }
}