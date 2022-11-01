package bitwise;

public class OperationsOnBits {
    public static void main(String[] args) {
        System.out.println(findTheIthBitOfNumber(20, 5));
        System.out.println(setTheIthBitOfNumber(20, 5));
        System.out.println(resetTheIthBitOfNumber(20, 4));
    }
    
    public static int findTheIthBitOfNumber(int n, int i){

        // number & 1 = number 
        // number & 0 = number
        // we will & the ith bit with 1 and rest with zero
        // now we need to right shift the ans towards the end
        return ((n & (1 << (i-1))) >> (i-1));      
    }

    public static int setTheIthBitOfNumber(int n, int i){
        
        // here if the ith bit is 1 we need to set it to 1 only
        // but if it is 0 we need to set it to 1 
        // 1 | 1 = 1
        // 1 | 0 = 1
        // we can use the OR bitwise operator
        // for the rest of the numbers we need to OR them with 0 so that we get the number as it is
        return (n | (1 << (i-1)));
    }

    public static int resetTheIthBitOfNumber(int n, int i){
        // resetting the bit means setting the ith bit to 0 
        // if ith bit = 0, keep it as 0
        // if ith bit = 1, make it 0
        // ith bit & 0 = 0
        // to get rest numbers as it as number & 1 = number
        return n & ~(1 << (i-1));
    }
}
