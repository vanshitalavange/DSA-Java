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
        
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= (n + (n - 1)) - (i-1); j++) {
                
                if(j >= i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
