// Q. Find the smallest element in the array >= target 
package searching.binary_search.easy;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = { 18, 15, 12, 10, 9, 7, 5, 3 };
        int target = 6;
        System.out.println("Output: " + findCeiling(arr, target));
    }

    static int findCeiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAscending = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (isAscending) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return isAscending ? arr[start] : arr[end];
    }

}
