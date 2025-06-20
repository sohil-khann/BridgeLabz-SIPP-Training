import java.util.Arrays;

public class NumberPropertiesChecker {

    public static int countDigits(int number) {
        if (number == 0) {
            return 1;
        }
        return (int) Math.log10(Math.abs(number)) + 1;
    }

    public static int[] getDigitsArray(int number) {
        String s = String.valueOf(Math.abs(number));
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = Character.getNumericValue(s.charAt(i));
        }
        return digits;
    }

    public static int[] reverseDigitsArray(int[] digits) {
        int[] reversedDigits = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversedDigits[i] = digits[digits.length - 1 - i];
        }
        return reversedDigits;
    }

    public static boolean compareArrays(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static boolean isPalindrome(int number) {
        int[] digits = getDigitsArray(number);
        int[] reversedDigits = reverseDigitsArray(digits);
        return compareArrays(digits, reversedDigits);
    }

    public static boolean isDuckNumber(int number) {
        String s = String.valueOf(Math.abs(number));
        // A duck number contains a zero, and the first digit is not zero
        if (s.length() > 0 && s.charAt(0) == '0') {
            return false; // Numbers with leading zeros (like 012) are not considered duck numbers in some definitions
        }
        return s.contains("0");
    }

    public static void main(String[] args) {
        int number1 = 121;
        System.out.println("Number: " + number1);
        System.out.println("Count of digits: " + countDigits(number1));
        System.out.println("Digits array: " + Arrays.toString(getDigitsArray(number1)));
        System.out.println("Reversed digits array: " + Arrays.toString(reverseDigitsArray(getDigitsArray(number1))));
        System.out.println("Is Palindrome: " + isPalindrome(number1));
        System.out.println("Is Duck Number: " + isDuckNumber(number1));

        System.out.println("\n---");

        int number2 = 102;
        System.out.println("Number: " + number2);
        System.out.println("Count of digits: " + countDigits(number2));
        System.out.println("Digits array: " + Arrays.toString(getDigitsArray(number2)));
        System.out.println("Reversed digits array: " + Arrays.toString(reverseDigitsArray(getDigitsArray(number2))));
        System.out.println("Is Palindrome: " + isPalindrome(number2));
        System.out.println("Is Duck Number: " + isDuckNumber(number2));

        System.out.println("\n---");

        int number3 = 012; // This will be treated as 10 in Java
        System.out.println("Number: " + number3 + " (Note: 012 is interpreted as 10 in Java)");
        System.out.println("Is Duck Number: " + isDuckNumber(number3));
    }
}