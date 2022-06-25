package searching.binary_search;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 8, 9, 0, 1, 2 };
        int target = 0;
        int pivot = findPivot(arr, target);
        int onLeft = binarySearch(arr, target, 0, pivot, true);
        if(onLeft != -1){
            System.out.println("Output: "+onLeft);
        }else{
            System.out.println("Output: "+binarySearch(arr, target, pivot + 1, arr.length - 1, true));
        }

    }

    public static int findPivot(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[start] <= arr[mid]) {
                start = mid + 1;
            } else if (arr[start] > arr[mid]) {
                end = mid - 1;
            }
        }
        return -1;
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
