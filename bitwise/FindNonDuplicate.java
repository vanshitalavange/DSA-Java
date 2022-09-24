/*
  Question: array of size n contains duplicates for all numbers except one number,
  find that number

  Approach: number^number = 0
  By using XOR operator on all elements of array, all the duplicates will 
  result in 0 and non-duplicate will remain as it is
 */
package bitwise;

public class FindNonDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 1, 3, 2, 4, 2, 4, 6 };
        System.out.println(findNotRepeatingNumber(arr));
    }

    public static int findNotRepeatingNumber(int[] arr) {

        int ans = 0;
        for (int i = 0; i < arr.length; i++) {

            ans = ans ^ arr[i];

        }
        return ans;
    }
}
