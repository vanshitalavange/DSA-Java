/*

**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********

 */
package patterns;

public class Pattern_18 {
    public static void main(String[] args) {
        pattern18(5);
    }

    static void pattern18(int n) {

        for (int i = 1; i <= 2 * n; i++) {
            int half, total, spaces;
            if (i <= n) {
                half = (n - i) + 1;
            } else {
                half = i - n;
            }
            total = 2 * half;
            spaces = 2 * n - total;

            for (int j = 1; j <= 2 * n; j++) {

                if (j > half && j <= (half + spaces)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
}
