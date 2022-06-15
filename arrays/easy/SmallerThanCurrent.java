/*
Q. Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
Return the answer in an array.
Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]
 */
package arrays.easy;

import java.util.Arrays;

public class SmallerThanCurrent {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        System.out.println("Input: "+Arrays.toString(nums));
        System.out.println("Output: "+Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int checkIndex = nums[i];
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    if (nums[j] < checkIndex)
                        count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}
