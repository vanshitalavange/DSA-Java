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

            if (i <= n) {

                for (int j = 1; j <= n; j++) {

                    if (j >= i) {
                        System.out.print("* ");
                    } else {
                        System.out.print(" ");
                    }
                }

            } else {

                for (int j = 1; j <= n; j++) {
                   
                    if(j >= n-((i-n)-1)){
                        System.out.print("* ");
                    }else{
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }
    }
}
