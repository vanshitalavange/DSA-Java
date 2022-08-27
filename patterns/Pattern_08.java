/*

    *
   ***
  *****
 *******
*********

*/
package patterns;

class Pattern_08 {
    public static void main(String[] args) {
        pattern8(5);
    }

    static void pattern8(int n) {

        for (int i = 1; i <= n; i++) {
            int stars = i + (i - 1);
            int startPos = n - (i - 1);
            for (int j = 1; j <= n + n - 1; j++) {
                if (j >= startPos) {
                    while(stars > 0){
                        System.out.print("*");
                        stars--;
                    }
                }else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
