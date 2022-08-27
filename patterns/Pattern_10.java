/*

    * 
   * * 
  * * * 
 * * * * 
* * * * * 

*/
package patterns;

class Pattern_10 {
    public static void main(String[] args) {
        pattern10(5);
    }

    static void pattern10(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                if (j >= n - (i - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}