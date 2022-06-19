/*
 * Q. There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.
You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.
Input: gain = [-4,-3,-2,-1,4,3,2]]
Output: 0
Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 1.
 */

package arrays.easy;

import java.util.Arrays;

public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        System.out.println("Input: "+Arrays.toString(gain));
        System.out.println("Output: "+largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {
        int[] altitudes = new int[gain.length+1];
        int j = 1;
        int max = 0;
        for(int i=0;i<gain.length;i++){
            altitudes[j] = altitudes[j-1] + gain[i];
            if(altitudes[j] > max)
                max = altitudes[j];
            j++;
        }
        return max;
    }
}
