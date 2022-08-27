/*

*********
 *******
  *****
   ***
    *

*/
package patterns;

class Pattern_09 {
    public static void main(String[] args) {
        pattern9(5);
    }

    static void pattern9(int n) {
        
        int decrementValue = 0;
        for (int i = 1; i <= n; i++) {
            int stars = n+(n-1) - decrementValue;
            for (int j = 1; j <= n + n - 1; j++) {
                if (j >= i) {
                    while(stars > 0){
                        System.out.print("*");
                        stars--;
                    }
                }else{
                    System.out.print(" ");
                }
            }
            decrementValue += 2;
            System.out.println();
        }
    }
}
