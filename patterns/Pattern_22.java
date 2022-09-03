/*

1 
0 1
1 0 1
0 1 0 1
1 0 1 0 1

 */
package patterns;

public class Pattern_22 {
    public static void main(String[] args) {
        pattern22(5);
    }

    static void pattern22(int n) {

        for (int i = 1; i <= n; i++) {
            int start = 1;
            int opposite = 0;
            if (i % 2 == 0) {
                start = 0;
                opposite = 1;
            }
            for (int j = 1; j <= i; j++) {

                if (j % 2 == 0) {
                    System.out.print(opposite + " ");
                } else {
                    System.out.print(start + " ");
                }
            }
            System.out.println();
        }
    }
}
