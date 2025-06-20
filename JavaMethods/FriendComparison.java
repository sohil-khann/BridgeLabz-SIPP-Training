import java.util.Scanner;

public class FriendComparison {
    public static int findYoungestFriend(int[] ages) {
        int youngest = 0;
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < ages[youngest]) {
                youngest = i;
            }
        }
        return youngest;
    }

    public static int findTallestFriend(double[] heights) {
        int tallest = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] > heights[tallest]) {
                tallest = i;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i]);
            System.out.print("Age: ");
            ages[i] = input.nextInt();
            System.out.print("Height (cm): ");
            heights[i] = input.nextDouble();
        }

        int youngest = findYoungestFriend(ages);
        int tallest = findTallestFriend(heights);

        System.out.println("\nResults:");
        System.out.println("Youngest: " + names[youngest] + " (" + ages[youngest] + " years)");
        System.out.println("Tallest: " + names[tallest] + " (" + heights[tallest] + " cm)");

        input.close();
    }
}