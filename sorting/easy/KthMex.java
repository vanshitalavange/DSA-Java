// Amazon job-a-thon challenge question
// Question link : https://practice.geeksforgeeks.org/contest/job-a-thon-exclusive-hiring-challenge-2-for-amazon-alexa/problems/#
package sorting.easy;
import java.util.*;
public class KthMex {

    public static void main(String[] args) {
      int[] nums = {44,45,73,95,26,162,35,65,5,39,85,92,75,143,130,85,62,116,151,35,71,165,181,129,75,126,83,21,82,24,47,126,10,61,38,36,40,14,101,46,177,128,138,69,88,26,95,91,142,63,126,154,45,66,101,61,9,125,83,32,149,71,158,159,133,137,13,173,92,55,160,86,124,56,97,29,83,9,61,166,73,129,138,59,12,180,121,145,122,145,178};
      System.out.println(kthMex(91,72,nums));
    }

    public static int kthMex(int n, int k, int arr[]) {
      
        boolean containsZero = false;
        // using cyclic sort
        int i = 0;
        while (i < arr.length) {

            if (arr[i] == 0) {
                containsZero = true;
            }

            if (arr[i] - 1 != i) {

                if (arr[i] > 0 && arr[i] <= arr.length) {

                    if (arr[arr[i] - 1] == arr[i]) {
                        i++;
                    } else {
                        int temp = arr[arr[i] - 1];
                        arr[arr[i] - 1] = arr[i];
                        arr[i] = temp;
                    }
                } else {
                    i++;
                }
            } else {
                i++;
            }

        }

        int count;
        int missingPositive = 0;
        if (containsZero) {
            count = 0;

        } else {
            count = 1;
        }

        // checking all missing positives
        int j = 0;
        while (j < arr.length) {

            if (count == k) {
                return missingPositive;
            }
            if (arr[j] - 1 != j) {
                count++;
                missingPositive = j + 1;
            }

            j++;
        }

        // checking remaining missing positives
        Arrays.sort(arr);
        int nextPositive = missingPositive + 1;

        while (count < k) {
            if (!binarySearch(nextPositive, arr)) {
                count++;
                missingPositive = nextPositive;
            }
            nextPositive++;

        }

        return missingPositive;
    }

    public static boolean binarySearch(int target, int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}
