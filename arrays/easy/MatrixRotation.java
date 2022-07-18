// Question link: https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
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
        int n = mat.length;
        int[][] ans = new int[n][n];
        for (int i = 0; i < mat.length; i++){
          for (int j = 0; j < mat.length; j++){
              ans[i][j] = mat[i][j];
          }
        }
        
        for(int k=0;k<4;k++){
            int row = 0;
            int col = mat.length - 1;
            
            for(int i=0;i<mat.length;i++){
                row = 0;
                for(int j=0;j<mat.length;j++){
                    ans[row][col] = mat[i][j];
                    row++;
                }
                col--;
            }
            if(Arrays.deepEquals(ans, target)){
                return true;
            }else{
                for (int i = 0; i < mat.length; i++){
                for (int j = 0; j < mat.length; j++){
                  mat[i][j] = ans[i][j];
                }
             }   
            }
            
        }
        return false;
        
      }
}