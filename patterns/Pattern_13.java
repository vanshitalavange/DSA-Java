/*

    *
   * *
  *   *
 *     *
*********

*/
package patterns;

class Pattern_13 {
    public static void main(String[] args) {
        pattern13(5);
    }

    static void pattern13(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n + (i - 1); j++) {
                if (i < n) {
                    if (j == n - (i - 1) || j == n + (i - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print("*");
                }

            }

            System.out.println();
        }
    }
}
