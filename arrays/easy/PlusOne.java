// Question link: https://leetcode.com/problems/plus-one/
package arrays.easy;
import java.math.BigInteger;
import java.util.*;
public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {1,2,3};
        System.out.println("Output: "+Arrays.toString(plusOne(digits)));
    }
    public static int[] plusOne(int[] digits) {
        String num = "";
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<digits.length;i++){
            num = num + digits[i];
        }
        BigInteger convertedNum = new BigInteger(num);
        BigInteger incrementedNum = convertedNum.add(BigInteger.valueOf(1));
        String finalNum = incrementedNum + "";
        for(int i=0;i<finalNum.length();i++){
            int number = Integer.parseInt(Character.toString(finalNum.charAt(i)));
            list.add(number);
        }
        int[] ans = new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}
