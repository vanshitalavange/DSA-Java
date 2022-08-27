/*

* * * * * 
 * * * * 
  * * * 
   * * 
    * 

*/
package patterns;

class Pattern_11 {
    public static void main(String[] args) {
        pattern11(5);
    }

    static void pattern11(int n) {
        
        
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= n; j++) {

                if(j >= i){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
               
            }

            System.out.println();
        }
    }
}
