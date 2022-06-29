// Question link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
package searching.binary_search;
import java.util.*;
public class TwoSumII {
public static void main(String[] args) {
    int[] numbers = {2,7,11,15};
    int target = 9;
    System.out.println("Output: "+Arrays.toString(twoSum(numbers, target)));
}    
public static int[] twoSum(int[] numbers, int target) {
    int start = 0;
    int end = numbers.length - 1;
    while(start<=end){
        int sum = numbers[start] + numbers[end];
        if(sum > target){
            end--;
        }else if(sum < target){
            start++;
        }else{
            return new int[]{start+1,end+1};
        }
    }
    return new int[]{};
}
}
