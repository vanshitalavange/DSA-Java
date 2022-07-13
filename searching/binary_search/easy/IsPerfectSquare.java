// Question link: https://leetcode.com/problems/valid-perfect-square/
package searching.binary_search.easy;

public class IsPerfectSquare {
    public static void main(String[] args) {
        int num = 16;
        System.out.println("Output: "+isPerfectSquare(num));
    }
    public static boolean isPerfectSquare(int num) {
        int start = 0;
        int end = num < 46340 ? num/2 : 46340;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid*mid == num){
                return true;
            }else if(mid*mid > num){
                end = mid -1 ;
            }else if(mid*mid <num){
                start = mid+1;
            }
        }
        return num == 1 ? true : false;
    }
}
