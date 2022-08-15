// Question link: https://leetcode.com/problems/matrix-cells-in-distance-order/
package sorting.easy;
import java.util.*;
public class MatrixCellsDistanceOrder {
    public static void main(String[] args) {
        int[][] ans = allCellsDistOrder(2, 3, 1,2);

        for(int i=0;i<ans.length;i++){
            System.out.println(Arrays.toString(ans[i]));
        }
    }

    public static int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        // adding all values to ans array
        int[][] ans = new int[rows * cols][2];

        ans[0] = new int[] { rCenter, cCenter };

        int ansRow = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                boolean isCenter = i == rCenter && j == cCenter;
                if (!isCenter) {
                    ans[ansRow] = new int[] { i, j };
                    ansRow++;
                }

            }
        }

        // insertion sort approach

        for (int i = 1; i < ans.length - 1; i++) {

            for (int j = i + 1; j > 1; j--) {
                int currDiff = Math.abs(ans[j][0] - rCenter) + Math.abs(ans[j][1] - cCenter);
                int prevDiff = Math.abs(ans[j - 1][0] - rCenter) + Math.abs(ans[j - 1][1] - cCenter);
                if (currDiff < prevDiff) {
                    int[] temp = ans[j];
                    ans[j] = ans[j - 1];
                    ans[j - 1] = temp;
                }
            }
        }

        return ans;

    }
}
