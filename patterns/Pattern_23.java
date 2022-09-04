/*

n = 3
  *   *   *  
 * * * * * *
*   *   *   *

n = 2
  *   *  
 * * * * 
*   *   *

 */
package patterns;

public class Pattern_23 {
    public static void main(String[] args) {
        pattern23(3);
    }

    static void pattern23(int n) {
        int blanks = 5 + (n - 1) * 4;
        int start = 3;
        for (int i = 1; i <= 3; i++) {
            int temp = start + 0;
            for (int j = 1; j <= blanks; j++) {

                if (i == 1) {
                    if (j == temp) {
                        System.out.print("*");
                        temp += 4;
                    } else {
                        System.out.print(" ");
                    }
                } else if (i == 2) {
                    if (j % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j == temp) {
                        System.out.print("*");
                        temp += 4;
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            start--;
            System.out.println();
        }
    }
}
