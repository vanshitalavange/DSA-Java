package arrays.easy;
import java.util.*;
public class FlipImage {
    public static void main(String[] args) {
        int[][] image = new int[][]{
            {1,1,0},{1,0,1},{0,0,0}
        };
        int[][] output = flipAndInvertImage(image);
        System.out.print("Output: ");
        for(int i =0;i<output.length;i++){
            System.out.print(Arrays.toString(output[i]));
        }
       
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int[][] ans = new int[image.length][];
        for(int i=0;i<image.length;i++){
            ans[i] = reverseAndInvertArray(image[i]);
        }
        return ans;
    }
    public static int[] reverseAndInvertArray(int[] arr){
        int[] flippedRow = new int[arr.length];
        int j = 0;
        for(int i=arr.length-1;i>=0;i--){
             flippedRow[j] = arr[i];
             if(flippedRow[j]==0)
                 flippedRow[j] = 1;
             else
                 flippedRow[j] = 0;
             j++;
        }
        return flippedRow;
    }
}
