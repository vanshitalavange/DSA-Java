//Question link: https://www.geeksforgeeks.org/program-for-length-of-a-string-using-recursion/
package recursion.easy;

public class StringLength {
    public static void main (String[] args) {
        String s = "vanshita";
        System.out.println(findLength(s+'\0',0));
     }
     
     static int findLength(String s,int i){
         
        if(s.charAt(i) == '\0'){
             return i;
        }
         
         return findLength(s,i+1);
     }
}
