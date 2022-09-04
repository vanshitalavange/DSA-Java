/*

    1    
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1

*/
package patterns;

import java.util.*;

class Pattern_16 {
    public static void main(String[] args) {
        pattern16(5);
    }

    static void pattern16(int n) {
        StringBuilder digits = new StringBuilder();
        List<Integer> prev = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        int startIndex = n;
        int endIndex = n;
        for (int i = 1; i <= n; i++) {
            digits.setLength(0);
            int arrIndex = 0;
            for (int j = 1; j <= 2 * n - 1;) {

                if (j > startIndex && j < endIndex) {

                    int value1 = prev.get(arrIndex);
                    int value2 = i > 2 ? prev.get(arrIndex + 1) : 0;
                    int sum = value1 + value2;
                    System.out.print(sum + " ");
                    curr.add(sum);
                    arrIndex++;
                    j += 2;

                } else if (j == startIndex || j == endIndex) {
                    System.out.print("1 ");
                    curr.add(1);
                    j += 2;
                } else {
                    System.out.print(" ");
                    j++;
                }
            }
            System.out.println();
            prev = List.copyOf(curr);
            curr.clear();
            startIndex--;
            endIndex++;
        }
    }
}
