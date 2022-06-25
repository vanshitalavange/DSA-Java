// Question link: https://leetcode.com/problems/find-in-mountain-array/
package searching.binary_search;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] nums = { 1, 5, 2 };
        int target = 2;
        System.out.println("Output: " + findInMountainArray(target, nums));
    }

    public static int findInMountainArray(int target, int[] nums) {
        int peak = findPeakElement(nums);
        int len = nums.length - 1;
        int onLeft = binarySearch(nums, target, 0, peak, true);
        if (onLeft != -1) {
            return onLeft;
        } else {
            return binarySearch(nums, target, peak + 1, len, false);
        }
    }

    public static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static int binarySearch(int[] nums, int target, int start, int end, boolean isAsc) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
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
        return -1;
    }
}
