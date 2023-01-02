//Question link: https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/
package recursion.easy;

public class MinMaxInArray {
    public static void main (String[] args) {
	    int[] arr = new int[]{1, 4, 45, 6, 10, -8};
	    System.out.println("min = "+min(arr,0));
	    System.out.println("max = "+max(arr,0));
	}
    
    static int min(int[] arr, int i){
        
        if(i == arr.length-1){
            return arr[i];
        }
        
        return Math.min(arr[i], min(arr, i+1));
        
    }
    
    static int max(int[] arr, int i){
         if(i == arr.length-1){
            return arr[i];
        }
        
        return Math.max(arr[i], max(arr, i+1));
        
    }
}
