// Question link: https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
package arrays.easy;

import java.util.*;

public class RandomIntegerArraySumToZero {
    public static void main(String[] args) {
        int n = 11;
        System.out.println("Output: " + Arrays.toString(sumZero(n)));
    }

    public static int[] sumZero(int n) {
        int[] ans = new int[n];
        if (n == 1) {
            return ans;
        } else {
            int positiveRandom = 1000;
            int negativeRandom = -1000;
            int midForOdd = -1;
            if (n % 2 != 0) {
                midForOdd = n / 2;
            }
            int midIndex = n / 2;
            for (int i = 0; i < ans.length; i++) {
                if (i < midIndex) {
                    ans[i] = negativeRandom;
                    negativeRandom++;
                } else if (i == midForOdd) {
                    ans[i] = 0;
                } else {
                    ans[i] = positiveRandom;
                    positiveRandom--;
                }
            }
            return ans;
        }
    }
}
