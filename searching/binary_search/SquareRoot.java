package searching.binary_search;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println("Output: "+mySqrt(2147394499));
    }

    public static int mySqrt(int x) {
        int start = 0;
        int end = x < 46340 ? x : 46340;
    //square root of maximum integer number = 46340
            if(x == 0 || x == 1)
                return x;
            while(start<=end){
                int mid = start+(end-start)/2;
                if(mid*mid == x){
                    return mid;
                }else if(x < mid*mid){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
            return start-1;
        }
}
