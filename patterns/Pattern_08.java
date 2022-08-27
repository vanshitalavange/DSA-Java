/*

    *
   ***
  *****
 *******
*********

*/
package patterns;

class Pattern_08 {
    public static void main(String[] args) {
        pattern8(5);
    }

    static void pattern8(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n + (i - 1); j++) {

                if (j >= n - (i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
