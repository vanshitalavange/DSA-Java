// Question link: https://leetcode.com/problems/lucky-numbers-in-a-matrix/
package arrays.easy;

import java.util.*;

public class LuckyNumberInMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {
                { 7, 8 },
                { 1, 2 },
        };
        System.out.println("Output: " + luckyNumbers(matrix));

    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> luckyNumbers = new ArrayList<Integer>();
        List<Integer> minOfRows = new ArrayList<Integer>();
        List<Integer> maxOfColumns = new ArrayList<Integer>();
        for (int i = 0; i < matrix.length; i++) {
            int min = getMinInRow(matrix, i);
            minOfRows.add(min);
            for (int j = 0; j < matrix[i].length; j++) {
                int max = getMaxInCol(matrix, j);
                if (!maxOfColumns.contains(max)) {
                    maxOfColumns.add(max);
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == minOfRows.get(i) && matrix[i][j] == maxOfColumns.get(j)) {
                    luckyNumbers.add(matrix[i][j]);
                }
            }
        }
        return luckyNumbers;
    }

    public static int getMinInRow(int[][] matrix, int rowIndex) {
        int[] arr = matrix[rowIndex];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    public static int getMaxInCol(int[][] matrix, int colIndex) {
        int max = 0;
        int rowIterator = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[rowIterator][colIndex] > max)
                max = matrix[rowIterator][colIndex];
            rowIterator++;
        }
        return max;
    }
}
