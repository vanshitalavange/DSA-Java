package searching.binary_search.easy;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 3, 6, 8, 10, 23 };
        System.out.println(binarySearch(arr, 23, 0, arr.length - 1));
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (target > arr[mid]) {
            return binarySearch(arr, target, mid + 1, end);
        }
        return binarySearch(arr, target, start, mid - 1);

    }
}
