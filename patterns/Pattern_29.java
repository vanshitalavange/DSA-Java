/*

1 2 3 4 5 6 7 
 2 3 4 5 6 7
  3 4 5 6 7
   4 5 6 7
    5 6 7
     6 7
      7
     6 7
    5 6 7
   4 5 6 7
  3 4 5 6 7
 2 3 4 5 6 7
1 2 3 4 5 6 7

 */
package patterns;

public class Pattern_29 {
    public static void main(String[] args) {
        pattern29(7);
    }

    static void pattern29(int n) {
        int start = 1;
        int end = 2 * n - 1;
        for (int i = 1; i <= 2 * n - 1; i++) {
            int num = i <= n ? i : n - (i - n);
            for (int j = 1; j <= 2 * n - 1;) {

                if (j >= start && j <= end) {
                    System.out.print(num + " ");
                    j += 2;
                    num++;
                } else {
                    System.out.print(" ");
                    j++;
                }
            }
            System.out.println();
            if (i < n) {
                start++;
                end--;
            } else {
                start--;
                end++;
            }
        }
    }
}
