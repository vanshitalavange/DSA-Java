/*

*****
*****
*****
*****
*****

*/
package patterns;
class Pattern_01 {
    public static void main(String[] args) {
       pattern1(5);
    }
    
    static void pattern1(int n){
        
        for(int i=1;i<=n;i++){
            
            for(int j=1;j <= n;j++){
                
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
