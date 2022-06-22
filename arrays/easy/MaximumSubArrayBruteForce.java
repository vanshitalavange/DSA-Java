// Question link: https://leetcode.com/problems/maximum-subarray/
// Approach used below to solve maximum sub-array sum is brute force and exceeds the time limit for larger inputs
package arrays.easy;

public class MaximumSubArrayBruteForce {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Output: "+maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        else{
            int max = nums[0];
            int sum = 0;
            for(int i=0;i<nums.length;i++){
                sum = sum + nums[i];
                if(sum > max){
                    max = sum;
                }
                for(int j=i+1;j<nums.length;j++){
                    sum = sum + nums[j];
                    if(sum > max){
                        max = sum;
                    }
                }
                sum = 0;
            }
            return max;
        }
    }
}
