/*

E D C B A 
D C B A
C B A
B A
A

 */
package patterns;

public class Pattern_34 {
    public static void main(String[] args) {
        pattern34(5);
    }

    static void pattern34(int n) {
        char ch = (char) (64 + n);
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - (i - 1); j++) {
                System.out.print(ch + " ");
                int ascii = (int) ch;
                ascii--;
                ch = (char) ascii;
            }
            ch = (char) (64 + (n - i));
            System.out.println();
        }
    }
}
