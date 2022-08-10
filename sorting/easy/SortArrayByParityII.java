package sorting.easy;
import java.util.*;
public class SortArrayByParityII {
    public static void main(String[] args) {
        int[] nums = { 4, 2, 5, 7 };
        System.out.println(Arrays.toString(sortArrayByParityII(nums)));
    }

    public static int[] sortArrayByParityII(int[] nums) {

        int i = 0;
        int j = 1;
        while (i < nums.length - 1) {
            if (i % 2 == 0) {

                if (nums[i] % 2 == 0) {
                    i++;
                    j = i + 1;
                } else {
                    // nums[j] should be even
                    if (j < nums.length) {
                        if (nums[j] % 2 == 0) {
                            int temp = nums[j];
                            nums[j] = nums[i];
                            nums[i] = temp;
                        } else {
                            j++;
                        }
                    }

                }

            } else if (i % 2 != 0) {

                if (nums[i] % 2 != 0) {
                    i++;
                    j = i + 1;
                } else {

                    if (j < nums.length) {
                        // nums[j] should be odd
                        if (nums[j] % 2 != 0) {
                            int temp = nums[j];
                            nums[j] = nums[i];
                            nums[i] = temp;
                        } else {
                            j++;
                        }
                    }

                }
            }
        }

        return nums;
    }
}
