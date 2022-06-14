//Q. Define a method to find out if a number is prime or not.
package functions;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = input.nextInt();
        String result = checkPrime(num) ? "Prime" : "Not Prime";
        System.out.println(result);
    }

    static boolean checkPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
