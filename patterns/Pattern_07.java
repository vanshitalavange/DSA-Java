/*

*****
 ****
  ***
   **
    *

*/
package patterns;

class Pattern_07 {
    public static void main(String[] args) {
        pattern7(5);
    }

    static void pattern7(int n) {

        for (int i = 1; i <= n; i++) {
            int spaces = n - (n - (i-1));
            for (int j = 1; j <= n; j++) {
                if (j <= spaces) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}
