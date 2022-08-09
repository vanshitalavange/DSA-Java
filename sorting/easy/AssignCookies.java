package sorting.easy;

import java.util.*;

public class AssignCookies {
    public static void main(String[] args) {
        int[] g = { 1, 2, 3 };
        int[] s = { 3 };
        System.out.println(findContentChildren(g, s));
    }

    public static int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int j = 0;

        for (int i = 0; i < g.length; i++) {

            if (j < s.length) {

                while (j < s.length) {
                    if (s[j] >= g[i]) {
                        count++;
                        j++;
                        break;
                    }
                    j++;
                }

            } else {
                return count;
            }
        }

        return count;

    }

}
