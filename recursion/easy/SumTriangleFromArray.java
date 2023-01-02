//Question link: https://www.geeksforgeeks.org/sum-triangle-from-array/
package recursion.easy;
import java.util.*;
public class SumTriangleFromArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
		sumTriangle(arr);
    }
    static void sumTriangle(int[] arr){
	    
	    if(arr.length == 1){
	        System.out.println(Arrays.toString(arr));
	        return;
	    }
	    
	    int[] sumOfConsecutive = consecutiveSum(arr);
	    sumTriangle(sumOfConsecutive);
	    System.out.println(Arrays.toString(arr));
	    
	}
	
	static int[] consecutiveSum(int[] arr){
	    int[] ans = new int[arr.length-1];
	    for(int i=0;i<arr.length-1;i++){
	        
	        ans[i] = arr[i] + arr[i+1];
	    }
	    return ans;
	}
}
