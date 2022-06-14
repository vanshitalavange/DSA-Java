package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RunningSum1D {
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
        System.out.println("Output: " + Arrays.toString(runningSum(nums)));
    }

    public static int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <= i; j++) {
                runningSum[i] = runningSum[i] + nums[j];
            }
        }
        return runningSum;
    }
}
