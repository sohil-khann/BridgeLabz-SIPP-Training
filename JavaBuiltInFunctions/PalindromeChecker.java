import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = getInput(scanner);
        boolean isPal = checkPalindrome(inputString);
        displayResult(inputString, isPal);

        scanner.close();
    }

    public static String getInput(Scanner scanner) {
        System.out.print("Enter a string to check if it's a palindrome: ");
        return scanner.nextLine();
    }

    public static boolean checkPalindrome(String str) {
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleanedStr.length() - 1;

        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void displayResult(String originalStr, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("\"" + originalStr + "\" is a palindrome.");
        } else {
            System.out.println("\"" + originalStr + "\" is not a palindrome.");
        }
    }
}