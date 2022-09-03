/*

    ****
    *  *
    *  *
    *  *
    ****

 */
package patterns;

public class Pattern_20 {
    public static void main(String[] args) {
        pattern20(5);
    }

    static void pattern20(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j < n; j++) {

                if (i == 1 || i == n) {
                    System.out.print("*");
                } else {
                    if (j == 1 || j == n - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
