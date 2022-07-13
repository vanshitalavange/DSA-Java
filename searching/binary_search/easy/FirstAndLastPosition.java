// Question link:https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
// facebook interview question
package searching.binary_search.easy;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 9;
        System.out.println("Output: "+Arrays.toString(searchRange(nums,target)));
        
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = getIndex(nums,target,true);
        if(ans[0] != -1){
            ans[1] = getIndex(nums, target, false);
        }
        return ans;
    }
   public static int getIndex(int[] nums,int target,boolean findFirstIndex){
       int start = 0;
       int end = nums.length - 1;
       int ans = -1;
       while(start <= end){
           int mid = start + (end - start)/2;
           if(target > nums[mid]){
               start = mid+1;
           }else if(target < nums[mid]){
               end = mid - 1;
           }else{
               ans = mid;
               if(findFirstIndex){
                   end = mid - 1;
               }else{
                   start = mid + 1;
               }
               
           }
       }
       return ans;
   }

}
