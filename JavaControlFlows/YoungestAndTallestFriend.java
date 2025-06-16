import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input for three friends
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        
        for(int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i] + ":");
            System.out.print("Age: ");
            ages[i] = scanner.nextInt();
            System.out.print("Height (in cm): ");
            heights[i] = scanner.nextDouble();
            System.out.println();
        }

        // Find youngest
        int minAge = ages[0];
        StringBuilder youngest = new StringBuilder();
        
        for(int i = 0; i < 3; i++) {
            if(ages[i] < minAge) {
                minAge = ages[i];
                youngest = new StringBuilder(names[i]);
            } else if(ages[i] == minAge) {
                if(youngest.length() > 0) {
                    youngest.append(" and ");
                }
                youngest.append(names[i]);
            }
        }

        // Find tallest
        double maxHeight = heights[0];
        StringBuilder tallest = new StringBuilder();
        
        for(int i = 0; i < 3; i++) {
            if(heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallest = new StringBuilder(names[i]);
            } else if(heights[i] == maxHeight) {
                if(tallest.length() > 0) {
                    tallest.append(" and ");
                }
                tallest.append(names[i]);
            }
        }

        System.out.println("\n--- Results ---");
        System.out.println("The youngest friend(s) is/are: " + youngest + " with age " + minAge);
        System.out.println("The tallest friend(s) is/are: " + tallest + " with height " + maxHeight + " cm");

        scanner.close();
    }
}