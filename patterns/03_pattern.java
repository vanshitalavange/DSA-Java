/*

*****
****
***
**
*

*/
class Pattern3 {
    public static void main(String[] args) {
       pattern3(5);
    }
    
    static void pattern3(int n){
        
        for(int i=1;i<=n;i++){
            
            for(int j=n+1-i;j > 0;j--){
                
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
