import java.util.Scanner;

public class FindMostFrequentCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        char mostFrequent = findMostFrequentChar(str);
        if (mostFrequent != 0) {
            System.out.println("Most Frequent Character: '" + mostFrequent + "'");
        } else {
            System.out.println("The string is empty.");
        }

        scanner.close();
    }

    public static char findMostFrequentChar(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int[] charCounts = new int[256]; // Assuming ASCII characters
        for (char c : str.toCharArray()) {
            charCounts[c]++;
        }

        int maxCount = -1;
        char mostFrequentChar = ' ';

        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] > maxCount) {
                maxCount = charCounts[i];
                mostFrequentChar = (char) i;
            }
        }
        return mostFrequentChar;
    }
}