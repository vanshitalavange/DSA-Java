package arrays.easy;

import java.util.Arrays;

public class ReshapeMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
        int r  = 1;
        int c = 4;
        int[][] ans = matrixReshape(mat, r, c);
        System.out.println("Output: ");
        for(int i=0;i<ans.length;i++){
            System.out.println(Arrays.toString(ans[i]));
        }
    }
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;
        
        int matElements = row * col;
        int reshapedElements = r*c;
        
        if(matElements == reshapedElements){
            int[][] reshaped = new int[r][c];
            int matRowIndex = 0;
            int matColIndex = 0;
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    if(matColIndex == col && matRowIndex < row){
                        matRowIndex++;
                        matColIndex = 0;
                    }
                    if(matRowIndex < row && matColIndex < col){
                          reshaped[i][j] = mat[matRowIndex][matColIndex];
                    }       
                    matColIndex++;
                }
            }
            return reshaped;
        }else{
            return mat;
        }
       
    }
    
}
