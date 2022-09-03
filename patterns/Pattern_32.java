/*

E 
D E
C D E
B C D E
A B C D E

 */
package patterns;

public class Pattern_32 {
    public static void main(String[] args) {
        pattern32(5);
    }

    static void pattern32(int n) {
        char ch = (char) (64 + n);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                int ascii = (int) ch;
                ascii++;
                ch = (char) ascii;
            }
            ch = (char) (64 + (n - i));
            System.out.println();
        }
    }
}
