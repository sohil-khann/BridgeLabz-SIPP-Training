import java.util.Arrays;

public class NumberChecker {

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

    public static boolean isDuckNumber(int number) {
        String s = String.valueOf(Math.abs(number));
        if (s.charAt(0) == '0' && s.length() > 1) {
            return false; // Leading zero is not allowed for duck number
        }
        return s.contains("0");
    }

    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;
        int numberOfDigits = countDigits(number);
        int tempNumber = number;

        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            sum += Math.pow(digit, numberOfDigits);
            tempNumber /= 10;
        }
        return sum == originalNumber;
    }

    public static int[] findLargestAndSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return new int[]{largest, secondLargest};
    }

    public static int[] findSmallestAndSecondSmallest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        int number = 153;
        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + countDigits(number));
        System.out.println("Digits array: " + Arrays.toString(getDigitsArray(number)));
        System.out.println("Is Duck Number: " + isDuckNumber(number));
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(number));

        int[] testArray = {5, 2, 8, 1, 9, 3, 8};
        int[] largestTwo = findLargestAndSecondLargest(testArray);
        System.out.println("Largest and Second Largest in " + Arrays.toString(testArray) + ": " + largestTwo[0] + ", " + largestTwo[1]);

        int[] smallestTwo = findSmallestAndSecondSmallest(testArray);
        System.out.println("Smallest and Second Smallest in " + Arrays.toString(testArray) + ": " + smallestTwo[0] + ", " + smallestTwo[1]);

        int duckTest1 = 102;
        int duckTest2 = 012; // This will be treated as 12 in Java
        int duckTest3 = 123;
        System.out.println("Is " + duckTest1 + " a Duck Number: " + isDuckNumber(duckTest1));
        System.out.println("Is " + duckTest2 + " a Duck Number (012): " + isDuckNumber(duckTest2));
        System.out.println("Is " + duckTest3 + " a Duck Number: " + isDuckNumber(duckTest3));

        int armstrongTest1 = 153;
        int armstrongTest2 = 9474;
        int armstrongTest3 = 123;
        System.out.println("Is " + armstrongTest1 + " an Armstrong Number: " + isArmstrongNumber(armstrongTest1));
        System.out.println("Is " + armstrongTest2 + " an Armstrong Number: " + isArmstrongNumber(armstrongTest2));
        System.out.println("Is " + armstrongTest3 + " an Armstrong Number: " + isArmstrongNumber(armstrongTest3));
    }
}