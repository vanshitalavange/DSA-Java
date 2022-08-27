/*

    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *

*/
package patterns;

class Pattern_15 {
    public static void main(String[] args) {
        pattern15(5);
    }

    static void pattern15(int n) {

        for (int i = 1; i <= 2 * n - 1; i++) {
            int startPos = 0;
            int endPos = 0;
            if (i <= n) {
                startPos = n - (i - 1);
                endPos = n + (i - 1);
            } else {
                startPos = (i - n) + 1;
                endPos = n + (n - 1) - (i - n);
            }

            for (int j = 1; j <= endPos; j++) {

                if (j == startPos || j == endPos) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();
        }
    }
}
