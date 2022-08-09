// Question link : https://leetcode.com/problems/third-maximum-number/
package sorting.easy;
public class ThirdMaximumNumber {
    public static void main(String[] args) {
         System.out.println(thirdMax(new int[]{2,2,3,1}));
         System.out.println(thirdMax(new int[]{3,2,1}));
         System.out.println(thirdMax(new int[]{1,2}));
    }
    // without using Arrays.sort() method 
    //selection sort approach
    public static int thirdMax(int[] nums) {
        int count = 0;
        int max = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            
            int end = nums.length - i - 1;
            int maxOnIndex = findIndexOfMax(nums,0,end);
            if(end != maxOnIndex){
                //number is not present at its correct index
                int temp = nums[end];
                nums[end] = nums[maxOnIndex];
                nums[maxOnIndex] = temp;
            }
            if(max > nums[end]){
                count++;
                max = nums[end];
            }
            if(count == 3){
                return max;
            }
            
        }
        
        return nums[nums.length-1];
    }
    
    public static int findIndexOfMax(int[] arr, int start, int end){
        
        int index = 0;
        for(int i=start;i<=end;i++){
            if(arr[i] > arr[index]){
                index = i;
            }
        }
        return index;
        
    }
}

// using Arrays.sort() method 
/* 
public int thirdMax(int[] arr) {
    int count = 0;
    int max = Integer.MAX_VALUE;
    Arrays.sort(arr);
    if(arr.length < 3){
        return arr[arr.length-1];
    }else{
       for(int i=arr.length-1;i>=0;i--){
        if(max > arr[i]){
            max = arr[i];
            count++;
        }
        if(count == 3){
            return max;
        }
      }
    }
   return arr[arr.length-1];
      
  }
*/
