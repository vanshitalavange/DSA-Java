/*

* * * * * 
 * * * *
  * * *
   * *
    *
    *
   * *
  * * *
 * * * *
* * * * *

 */
package patterns;

public class Pattern_12 {
    public static void main(String[] args) {
        pattern12(5);
    }

    static void pattern12(int n) {

        for (int i = 1; i <= n * 2; i++) {
            int startPos = 0;
            if (i <= n) {
                startPos = i;
            } else {
                startPos = n - ((i - n) - 1);
            }
            for (int j = 1; j <= n; j++) {

                if (j >= startPos) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
