package arrays.easy;
import java.util.*;
import java.math.BigInteger;
public class ArrayForm {
    public static void main(String[] args) {
        int[] num = { 9,9,9,9,9,9,9,9,9,9 };
        int k = 34;
        System.out.println("Output: "+addToArrayForm(num, k));
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> target = new ArrayList<Integer>();
        String number = "";
        for (int i = 0; i < num.length; i++) {
            number = number + num[i];
        }
        BigInteger convertedNumber = new BigInteger(number);
        BigInteger sum  = convertedNumber.add(BigInteger.valueOf(k));
        String finalNum = sum + "";
        for (int i = 0; i < finalNum.length(); i++) {
            int value = Integer.parseInt(Character.toString(finalNum.charAt(i)));
              target.add(i,value);
        }
        return target;
    }
}
