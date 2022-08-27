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
            int stars = i;
            int startPos = n - (i - 1);
            for (int j = 1; j <= n + n - 1; j++) {
                if (j >= startPos) {
                    while (stars > 0) {
                        System.out.print("* ");
                        stars--;
                    }
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}