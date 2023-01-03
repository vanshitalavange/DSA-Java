//Question link: https://practice.geeksforgeeks.org/problems/geek-onacci-number/0
package recursion.easy;
import java.util.*;
public class GeekonacciNumber {
    public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
	    int test = sc.nextInt();
	    for(int i=0;i<test;i++){
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();
	        int n = sc.nextInt();
	        System.out.println(geekonacci(a,b,c,n));
	   }
		
	}
	
	public static int geekonacci(int a, int b, int c, int n){
	    
	    if(n == 1){
	        return a;
	    }
	    if(n == 2){
	        return b;
	    }
	    if(n == 3){
	        return c;
	    }
	    
	    return geekonacci(a,b,c,n-1) + geekonacci(a,b,c,n-2) + geekonacci(a,b,c,n-3);
	    
	}
}
