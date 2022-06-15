/*
Q. Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].
Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
 */
package arrays.easy;

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
