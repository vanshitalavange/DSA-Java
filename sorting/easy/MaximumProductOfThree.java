// Question link: https://leetcode.com/problems/maximum-product-of-three-numbers/
package sorting.easy;
import java.util.*;
public class MaximumProductOfThree {
    public static void main(String[] args) {
        System.out.println(maximumProduct(new int[]{-100,-99,-98,2,10}));
    }
    public static int maximumProduct(int[] nums) {
        
        if(nums.length == 3){
            return nums[0]*nums[1]*nums[2];
        }
        
        Arrays.sort(nums);
        int n = nums.length;
        int product1 = nums[0] * nums[1] * nums[n-1];
        int product2 = nums[n-1] * nums[n-2] * nums[n-3];
        if(product1 > product2){
            return product1;
        }else{
            return product2;
        }
    }
}
