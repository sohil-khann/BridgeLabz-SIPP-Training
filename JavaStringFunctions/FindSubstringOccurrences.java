import java.util.Scanner;

public class FindSubstringOccurrences {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        System.out.print("Enter the substring to find: ");
        String subString = scanner.nextLine();

        int count = countSubstringOccurrences(mainString, subString);
        System.out.println("The substring \"" + subString + "\" occurs " + count + " times in the main string.");

        scanner.close();
    }

    public static int countSubstringOccurrences(String mainStr, String subStr) {
        if (mainStr == null || subStr == null || mainStr.isEmpty() || subStr.isEmpty()) {
            return 0;
        }

        int count = 0;
        int lastIndex = 0;
        while ((lastIndex = mainStr.indexOf(subStr, lastIndex)) != -1) {
            count++;
            lastIndex += subStr.length();
        }
        return count;
    }
}