// Question link: https://leetcode.com/problems/search-in-rotated-sorted-array-ii/ 
package searching.binary_search.easy;

public class SearchRotatedArrayWithDuplicates {
    public static void main(String[] args) {

        int[] arr = {2,5,6,0,0,1,2};
        int target = 0;
        System.out.println("Output: " + search(arr, target));
    }

    public static boolean search(int[] arr, int target) {
        int pivot = findPivot(arr);
        boolean onLeft = binarySearch(arr, target, 0, pivot, true);
        if (onLeft) {
            return onLeft;
        } else {
            return binarySearch(arr, target, pivot + 1, arr.length - 1, true);
        }

    }

    public static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        if (arr.length == 1) {
            return 0;
        } else {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (mid < end && arr[mid] > arr[mid + 1]) {
                    // pivot found
                    return mid;
                } else if (mid > start && arr[mid] < arr[mid - 1]) {
                    // pivot found
                    return mid - 1;
                } else if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                    if (mid < end && arr[start] > arr[start + 1]) {
                        return start;
                    }
                    start++;
                    if (mid > start && arr[end] < arr[end - 1]) {
                        return end - 1;
                    }
                    end--;
                } else if (arr[start] <= arr[mid]) {
                    start = mid + 1;
                } else if (arr[start] > arr[mid]) {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static boolean binarySearch(int[] nums, int target, int start, int end, boolean isAsc) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (isAsc) {
                if (target > nums[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target > nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
        }
        return false;
    }

}
