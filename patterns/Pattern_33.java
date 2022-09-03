/*

a 
B c 
D e F 
g H i J 
k L m N o 

 */
package patterns;

public class Pattern_33 {
    public static void main(String[] args) {
        pattern33(5);
    }

    static void pattern33(int n) {
        char ch = 'a';
        boolean isLowerCase = false;
        char uppercase = 'a';
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                if (!isLowerCase) {
                    System.out.print(ch + " ");
                    isLowerCase = true;
                } else {
                    System.out.print(uppercase + " ");
                    isLowerCase = false;
                }
                int ascii = (int) ch;
                ascii++;
                ch = (char) ascii;
                if (isLowerCase) {
                    uppercase = Character.toUpperCase(ch);
                }

            }
            System.out.println();
        }
    }
}
