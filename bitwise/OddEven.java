package bitwise;
/*
 * Understanding --> whenever we use any bitwise operator, 
 * the number is converted to binary 
 * As we know, any number & 1 gives that number so we just 
 * & the last digit of the number with 1 to know the if the last digit is 1 or 0 
 * if 1 then odd else even
 */
public class OddEven {
    public static void main(String[] args) {
        
        System.out.println(isOdd(65) ? "Odd" : "Even");
    }

    public static boolean isOdd(int n){
        return (n & 1) == 1;
    }
}
