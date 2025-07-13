public class BinarySearchRotationPoint {

    public static int findRotationPoint(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 6, 7, 8, 9, 1, 2, 3, 4};
        System.out.println("Rotation point index: " + findRotationPoint(arr1));

        int[] arr2 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("Rotation point index: " + findRotationPoint(arr2));

        int[] arr3 = {3, 4, 5, 1, 2};
        System.out.println("Rotation point index: " + findRotationPoint(arr3));

        int[] arr4 = {1, 2, 3, 4, 5};
        System.out.println("Rotation point index: " + findRotationPoint(arr4));
    }
}