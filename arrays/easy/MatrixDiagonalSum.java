/*
 * Q. Given a square matrix mat, return the sum of the matrix diagonals.
Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.
Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
 */
package arrays.easy;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat = new int[][] {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println("Output: " + diagonalSum(mat));
    }

    public static int diagonalSum(int[][] mat) {
        int rowPointer = 0;
        int primaryColPointer = 0;
        int secondaryColPointer = mat.length - 1;
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum = sum + mat[rowPointer][primaryColPointer];
            if (mat.length % 2 == 0) {
                sum = sum + mat[rowPointer][secondaryColPointer];
            } else {
                if (rowPointer != secondaryColPointer) {
                    sum = sum + mat[rowPointer][secondaryColPointer];
                }
            }
            rowPointer++;
            primaryColPointer++;
            secondaryColPointer--;
        }
        return sum;
    }
}
