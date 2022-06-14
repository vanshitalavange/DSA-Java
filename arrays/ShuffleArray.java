/*
 * Q. 
 */
package arrays;

import java.util.*;

public class ShuffleArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = input.nextInt();
        System.out.print("Enter array length: ");
        int arrayLength = input.nextInt();
        int[] nums = new int[arrayLength];
        System.out.println("Enter all elements of array: ");
        for (int i = 0; i < arrayLength; i++) {
            nums[i] = input.nextInt();
        }
        System.out.println("Input: " + Arrays.toString(nums));
        int[] shuffledArray = shuffle(nums, n);
        System.out.println("Output: " + Arrays.toString(shuffledArray));
    }

    static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int j = 0;
        for (int i = 0; i < n; i++) {
            ans[j] = nums[i];
            ans[j + 1] = nums[i + n];
            j += 2;
        }
        return ans;
    }
}
