/*
Q. Given an integer array nums of length n, you want to create an array ans of length 2n 
where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed). 
Specifically, ans is the concatenation of two nums arrays.
Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
*/
package arrays.easy;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int length = input.nextInt();
        int[] nums = new int[length];
        System.out.println("Enter all elements of array: ");
        for (int i = 0; i < length; i++) {
            nums[i] = input.nextInt();
        }
        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Output: " + Arrays.toString(getConcatenation(nums)));
    }

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }
}
