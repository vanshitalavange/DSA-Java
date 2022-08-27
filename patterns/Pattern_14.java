/*

*********
 *     *
  *   *
   * *
    *

*/
package patterns;

class Pattern_14 {
    public static void main(String[] args) {
        pattern14(5);
    }

    static void pattern14(int n) {

        for (int i = 1; i <= n; i++) {
            int endPos = (n + (n - 1)) - (i - 1);
            for (int j = 1; j <= endPos; j++) {
                if (i > 1) {
                    if (j == i || j == endPos) {
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
