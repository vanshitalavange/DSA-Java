// Question link: https://leetcode.com/problems/largest-perimeter-triangle/
package sorting.easy;
import java.util.*;
public class LargestPerimeterTriangle {
    public static void main(String[] args) {
        int[] nums = {2,1,2};
        System.out.println(largestPerimeter(nums));
    }
    public static int largestPerimeter(int[] nums) {
        
        Arrays.sort(nums);
        
        for(int i=nums.length-1;i>=2;i--){
            
            int a = nums[i-2];
            int b = nums[i-1];
            int c = nums[i];
            boolean isNonZero = checkIfNonZero(a,b,c);
            if(isNonZero){
                return a+b+c;
            }
        }
        return 0;
    }
    
    public static boolean checkIfNonZero(int a,int b,int c){
        
        int i=0;
        int count = 0;
        while(i < 3){
        
            int sumOfTwo = b+c;
            if(sumOfTwo > a){
                count++;
            }
            int[] swapped = swapThree(a,b,c);
            a = swapped[0];
            b = swapped[1];
            c = swapped[2];
            i++;
        }
        return count == 3;
    }
    
    public static int[] swapThree(int a, int b, int c){
        int[] ans = new int[3];
        a = a+b+c;
        
        b = a - (b+c);
        c = a - (b+c);
        a = a - (b+c);
        
        ans[0] = a;
        ans[1] = b;
        ans[2] = c;
             
        return ans;

    }

}
