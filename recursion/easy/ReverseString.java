package recursion.easy;
import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        char[] s = new char[]{'h','e','l','l','o'};
        System.out.println(Arrays.toString(helper(s, 0, s.length-1)));
    }

    public static char[] helper(char[] s, int start, int end){

        if(start > end){
            return s;
        }

        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;

        return helper(s,start+1,end-1);

    }
}
