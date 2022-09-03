/*

1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 

 */
package patterns;

public class Pattern_21 {
    public static void main(String[] args) {
        pattern21(5);
    }

    static void pattern21(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
