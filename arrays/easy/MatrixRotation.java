package arrays.easy;

import java.util.*;

public class MatrixRotation {
    public static void main(String[] args) {
        int[][] mat = new int[][] {
                { 0, 0, 0 },
                { 0, 1, 0 },
                { 1, 1, 1 }
        };
        int[][] target = new int[][] {
                { 1, 1, 1 },
                { 0, 1, 0 },
                { 0, 0, 0 }
        };
        System.out.println("output: " + findRotation(mat, target));
    }

    public static boolean findRotation(int[][] mat, int[][] target) {
        int m = mat.length;
        int start = 0;
        int end = m - 1;
        while (start <= end) {
            int[] temp = mat[start];
            mat[start] = mat[end];
            mat[end] = temp;
            start++;
            end--;
        }
        return Arrays.deepEquals(mat, target);
    }
}

// int m = mat.length;
// int[][] checkArray = new int[m][m];
// int row = 0;
// int count = 0;
// for(int i=m-1;i>=0;i--){
// for(int j=0;j<mat[i].length;j++){
// checkArray[row][j] = mat[i][j];
// if(checkArray[row][j] == target[row][j]){
// count++;
// }
// }
// row++;
// }
// if(count/mat.length == target.length){
// return true;
// }
// return false;