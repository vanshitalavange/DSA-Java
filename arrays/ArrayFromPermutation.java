/* Q. Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive). 
Input: nums = [0,2,1,5,3,4]
Output: [0,1,2,4,5,3] */

package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFromPermutation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int arrayLength = input.nextInt();
        int[] nums = new int[arrayLength];
        System.out.println("Enter all elements of array: ");
        for (int i = 0; i < arrayLength; i++) {
            nums[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        int[] finalArray = buildArray(nums);
        System.out.println(Arrays.toString(finalArray));

    }

    public static int[] buildArray(int[] nums) {

        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;

    }
}
