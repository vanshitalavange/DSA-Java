/*

1 1 1 1 1 1 
2 2 2 2 2 
3 3 3 3 
4 4 4 
5 5 
6 

 */
package patterns;

public class Pattern_26 {
    public static void main(String[] args) {
        pattern26(6);
    }

    static void pattern26(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - (i - 1); j++) {
                System.out.print(num + " ");
            }
            num++;
            System.out.println();
        }
    }
}
