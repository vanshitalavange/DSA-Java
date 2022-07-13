// Question link: https://leetcode.com/problems/search-a-2d-matrix/submissions/
package searching.binary_search;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] matrix = {
            {1},
            {3}
        };
        int target = 2;
        boolean ans = searchMatrix(matrix,target);
        System.out.println("Output="+ans);
    }

public static boolean searchMatrix(int[][] matrix, int target) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    int start = 0;
    int end = (rows*cols) - 1;
    while(start <= end){
        int mid = start + (end-start)/2;
        int rowIndex = mid/cols;
        int colIndex = mid%cols;
        if(target == matrix[rowIndex][colIndex]){
            return true;
        }else if(target < matrix[rowIndex][colIndex]){
            end = mid - 1;
        }else{
            start = mid + 1;
        }
    }
    return false;
}
}
