/*
 * Question link: https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
 */
package arrays.easy;

public class OddValuesInMatrix {
    public static void main(String[] args) {
        int[][] indices = {
                { 0, 1 }, { 1, 1 }
        };
        int m = 2;
        int n = 3;
        System.out.println("Output: " + oddCells(m, n, indices));
    }

    public static int oddCells(int m, int n, int[][] indices) {
        int[][] target = new int[m][n];
        int rowValue = 0;
        int colValue = 0;
        int oddCount = 0;
        for (int i = 0; i < indices.length; i++) {
            rowValue = indices[i][0];
            colValue = indices[i][1];
            target = incrementRowValues(rowValue, target);
            target = incrementColValues(colValue, target);
        }
        for (int i = 0; i < target.length; i++) {
            for (int j = 0; j < target[i].length; j++) {
                if (target[i][j] % 2 != 0) {
                    oddCount++;
                }
            }
        }
        return oddCount;

    }

    public static int[][] incrementRowValues(int rowValue, int[][] arr) {
        for (int i = 0; i < arr[rowValue].length; i++) {
            arr[rowValue][i] = arr[rowValue][i] + 1;
        }
        return arr;
    }

    public static int[][] incrementColValues(int colValue, int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == colValue) {
                    arr[i][j] = arr[i][j] + 1;
                }
            }
        }
        return arr;
    }
}
