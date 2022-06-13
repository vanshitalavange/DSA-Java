package functions;

import java.util.Scanner;

public class IsEvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = input.nextInt();
        String ans = IsEvenOdd(num) ? "Even" : "Odd";
        System.out.println(ans);
    }

    static boolean IsEvenOdd(int num) {
        return num % 2 == 0;
    }
}
