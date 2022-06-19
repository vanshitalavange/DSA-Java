/*
 * Q. Given an array nums of integers, return how many of them contain an even number of digits.
Input: nums = [12,345,2,6,7896]
Output: 2
 */
package arrays.easy;

public class FindNumberWithEvenDigit {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println("Output: "+findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            int numberOfDigits = getDigitCount(nums[i]);
            if(numberOfDigits%2==0)
                count++;
        }
        return count;
    }
    public static int getDigitCount(int num){
        int digitCount = 0;
        while(num > 0){
            digitCount++;
            num = num/10;       
        }
        return digitCount;
    }
}

