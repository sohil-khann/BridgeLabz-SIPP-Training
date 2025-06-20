import java.util.Random;
import java.util.Arrays;

public class FootballTeamAnalysis {

    public static int[] generatePlayerHeights(int size) {
        int[] heights = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + random.nextInt(101); // Height between 150 and 250 cm
        }
        return heights;
    }

    public static int sumHeights(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    public static double calculateMeanHeight(int[] heights) {
        if (heights.length == 0) {
            return 0.0;
        }
        return (double) sumHeights(heights) / heights.length;
    }

    public static int findShortestHeight(int[] heights) {
        if (heights.length == 0) {
            return -1; // Or throw an exception
        }
        int shortest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] < shortest) {
                shortest = heights[i];
            }
        }
        return shortest;
    }

    public static int findTallestHeight(int[] heights) {
        if (heights.length == 0) {
            return -1; // Or throw an exception
        }
        int tallest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallest) {
                tallest = heights[i];
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        int teamSize = 11;
        int[] playerHeights = generatePlayerHeights(teamSize);

        System.out.println("Player Heights (cm): " + Arrays.toString(playerHeights));

        System.out.println("Sum of heights: " + sumHeights(playerHeights) + " cm");
        System.out.printf("Mean height: %.2f cm\n", calculateMeanHeight(playerHeights));
        System.out.println("Shortest height: " + findShortestHeight(playerHeights) + " cm");
        System.out.println("Tallest height: " + findTallestHeight(playerHeights) + " cm");
    }
}