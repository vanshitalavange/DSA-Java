// select an element and put it at it's correct index
// select max/min and put at the correct index
package sorting;

import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 1,2,-5,-6,8,9 };
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxOnIndex = findMax(arr,0,last);
            int temp = arr[last];
            arr[last] = arr[maxOnIndex];
            arr[maxOnIndex] = temp;
        }
        return arr;
    }

    static int findMax(int[] arr, int start, int end) {
        int maxOnIndex = start;
        for (int i = 0; i <=end; i++) {
            if (arr[i] > arr[maxOnIndex]) {
                maxOnIndex = i;
            }
        }
        return maxOnIndex;
    }
}
