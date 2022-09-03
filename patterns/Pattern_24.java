/*

*        *
**      **
* *    * *
*  *  *  *
*   **   *
*   **   *
*  *  *  *
* *    * *
**      **
*        *

 */
package patterns;

public class Pattern_24 {
    public static void main(String[] args) {
        pattern24(10);
    }

    static void pattern24(int n) {

        for (int i = 1; i <= 2 * n; i++) {
            int spaces = 0;
            if (i <= n) {
                spaces = i - 2;
            } else {
                spaces = (n - (i - n)) - 1;
            }
            int frontEnd = 2 + spaces;
            int backStart = frontEnd - 1;
            for (int j = 1; j <= 2 * n; j++) {

                if (j <= n) {
                    if (j == 1 || j == frontEnd) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if ((2 * n - j) == backStart || (2 * n - j) == 0) {
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
