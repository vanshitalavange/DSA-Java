// Question link: https://leetcode.com/problems/relative-sort-array/
package sorting.easy;

import java.util.Arrays;

public class RelativeSortArray {
    public static void main(String[] args) {
        int[] arr1 = { 26, 21, 11, 20, 50, 34, 1, 18 };
        int[] arr2 = { 21, 11, 26, 20 };
        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {

        int k = 0;
        for (int i = 0; i < arr2.length; i++) {

            int curr = arr2[i];

            for (int j = 0; j < arr1.length; j++) {

                if (arr1[j] == curr) {

                    if (j != k) {

                        int temp = arr1[k];
                        arr1[k] = arr1[j];
                        arr1[j] = temp;
                    }

                    k++;
                }
            }
        }
        // sorting the remaining array in ascending order using insertion sort
        for (int i = k; i < arr1.length - 1; i++) {

            for (int j = i + 1; j > k; j--) {

                if (arr1[j] < arr1[j - 1]) {
                    int temp = arr1[j];
                    arr1[j] = arr1[j - 1];
                    arr1[j - 1] = temp;
                }
            }
        }

        return arr1;

    }
}
