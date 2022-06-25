// Q. Find the greatest element in the array <= target
package searching.binary_search;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = { 18, 15, 12, 10, 9, 7, 5, 3 };
        int target = 14;
        System.out.println("Output: " + findFloor(arr, target));
    }
    static int findFloor(int[] arr, int target){
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
        return isAscending ? arr[end] : arr[start];
    }
}
