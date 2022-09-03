/*

    *****
   *   *
  *   *
 *   *
*****

 */
package patterns;

public class Pattern_25 {
    public static void main(String[] args) {
        pattern25(5);
    }

    static void pattern25(int n) {

        for (int i = 1; i <= n; i++) {

            int start = n - (i - 1);
            int end = (2 * n - 1) - (i - 1);
            for (int j = 1; j <= 2 * n - 1; j++) {

                if (i == 1 || i == n) {
                    if (j >= start && j <= end) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j == start || j == end) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

    }
}
