/*

    *    
   * *
  * * *
 * * * *
* * * * * 
 * * * * 
  * * *
   * *
    *

 */
package patterns;

public class Pattern_28 {
    public static void main(String[] args) {
        pattern28(5);
    }

    static void pattern28(int n) {

        for (int i = 1; i <= 2 * n - 1; i++) {
            int start, end;
            if (i <= n) {
                start = n - (i - 1);
                end = (2 * n - 1) - (n - i);
            } else {
                start = (i - n) + 1;
                end = (2 * n - 1) - (i - n);
            }
            for (int j = 1; j <= 2 * n - 1;) {

                if (j >= start && j <= end) {
                    System.out.print("* ");
                    j += 2;
                } else {
                    System.out.print(" ");
                    j++;
                }
            }
            System.out.println();
        }
    }
}
