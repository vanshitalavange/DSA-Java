/*

*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

 */
package patterns;

public class Pattern_19 {
    public static void main(String[] args) {
        pattern19(5);
    }

    static void pattern19(int n) {

        for (int i = 1; i <= 2 * n - 1; i++) {
            int totalStars = 0;
            if (i <= n) {
                totalStars = 2 * i;
            } else {
                totalStars = 2 * (n - (i - n));
            }
            int half = totalStars / 2;
            int spaces = 2 * n - totalStars;
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
