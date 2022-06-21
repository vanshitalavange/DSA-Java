// Question link: https://leetcode.com/problems/transpose-matrix/
package arrays.easy;

import java.util.*;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] transposeMatrix = transpose(matrix, m, n);
        System.out.println("Output: ");
        for (int i = 0; i < transposeMatrix.length; i++) {
            System.out.println(Arrays.toString(transposeMatrix[i]));
        }
    }

    public static int[][] transpose(int[][] matrix, int m, int n) {
        int[][] transposeMatrix = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        return transposeMatrix;
    }
}
