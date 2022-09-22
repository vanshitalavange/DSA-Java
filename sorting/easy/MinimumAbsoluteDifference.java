// Question link: https://leetcode.com/problems/minimum-absolute-difference/
package sorting.easy;
import java.util.*;
public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        
        int[] arr = {4,2,1,3};
        System.out.println(minimumAbsDifference(arr));
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i + 1] - arr[i]) < minDiff) {
                minDiff = arr[i + 1] - arr[i];
            }
        }

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == minDiff) {
                ArrayList<Integer> sub = new ArrayList<>();
                sub.add(arr[i]);
                sub.add(arr[i + 1]);
                ans.add(sub);
            }
        }

        return ans;
    }
     
}
