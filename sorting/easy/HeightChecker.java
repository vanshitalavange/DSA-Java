// Question link : https://leetcode.com/problems/height-checker/
package sorting.easy;
import java.util.*;
public class HeightChecker {
    public static void main(String[] args) {
        System.out.println(heightChecker(new int[]{1,1,4,2,1,3}));
    }
    public static int heightChecker(int[] heights) {
    
        int[] sorted = heights.clone();
        int count = 0;
        Arrays.sort(sorted);
        for(int i=0;i<heights.length;i++){
             
             if(sorted[i] != heights[i]){
                 count++;
             }
        }
         
         return count;
         
    }
}
