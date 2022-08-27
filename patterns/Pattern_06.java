/*

    *
   **
  ***
 ****
*****

*/
package patterns;

class Pattern_06 {
    public static void main(String[] args) {
        pattern6(5);
    }

    static void pattern6(int n) {

        for (int i = 1; i <= n; i++) {
            int spaces = n - i;
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
