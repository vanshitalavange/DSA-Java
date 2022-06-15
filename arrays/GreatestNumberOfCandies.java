/*
 * Q. There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
Note that multiple kids can have the greatest number of candies.
Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true] 
 */
package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class GreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        System.out.println("Input: " + Arrays.toString(candies));
        ArrayList<Boolean> output = kidsWithCandies(candies, extraCandies);
        System.out.println("Output: " + output);
    }

    public static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = getMaxElementInArray(candies);
        ArrayList<Boolean> ans = new ArrayList<Boolean>(candies.length);
        for (int i = 0; i < candies.length; i++) {
            ans.add(false);
        }
        for (int i = 0; i < candies.length; i++) {
            int totalCandies = candies[i] + extraCandies;
            if (totalCandies >= max) {
                ans.set(i, true);
            }
        }
        return ans;
    }

    public static int getMaxElementInArray(int[] arr) {
        int max = 0;
        for (int i : arr) {
            if (i > max)
                max = i;
        }
        return max;
    }
}
