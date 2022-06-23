package searching.binary_search;

import java.util.Scanner;

public class SearchForTarget {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int len = input.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < len; i++) {
            arr[i] = input.nextInt();
        }
        ;
        System.out.println("Enter element to be searched: ");
        int target = input.nextInt();
        int index = searchElement(arr, target);
        System.out.println("Target element index: " + index);
    }

    public static int searchElement(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean ascending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (ascending) {
                if (target > arr[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            } else {
                if (target > arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }

        }
        return -1;
    }
}
