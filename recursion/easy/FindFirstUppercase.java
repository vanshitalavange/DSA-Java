//Question link: https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/
package recursion.easy;
public class FindFirstUppercase {
    public static void main (String[] args) {
        String s = "geeksforgeeKs";
        System.out.println(firstUppercase(s,0));
     }
     
     static char firstUppercase(String s,int i){
         
         if(i == s.length()){
             return 0;
         }
         if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
             return s.charAt(i);
         }
         
         return firstUppercase(s,i+1);
     }
}
