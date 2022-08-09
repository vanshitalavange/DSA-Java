// Question link: https://leetcode.com/problems/sort-array-by-parity/
package sorting.easy;
import java.util.*;
public class SortByParity {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 1, 4 };
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }

    public static int[] sortArrayByParity(int[] nums) {
        // similar to insertion sort approach
        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = i + 1; j > 0; j--) {

                if (nums[j] % 2 == 0 && nums[j - 1] % 2 != 0) {

                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                } else {
                    break;
                }
            }
        }

        return nums;
    }
}
