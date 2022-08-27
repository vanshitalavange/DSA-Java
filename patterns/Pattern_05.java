/*

*
**
***
****
*****
****
***
**
*

*/
class Pattern_05 {
    public static void main(String[] args) {
       pattern5(5);
    }
    
    static void pattern5(int n){
        
        for(int i=1;i<=n+n-1;i++){
            int endCondition = 0;
            if(i <= n){
                endCondition = i;
            }else{
                endCondition = n-(i-n);
            }
            for(int j=1;j<=endCondition;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
