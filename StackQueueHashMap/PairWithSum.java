import java.util.*;

public class PairWithSum {

    static boolean hasPairWithSum(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(target - num))
                return true;
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 7};
        int target = 17;
        System.out.println("Has pair: " + hasPairWithSum(arr, target)); // true
    }
}