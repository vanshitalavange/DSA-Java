// Q. Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

package functions;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int min = getMin(a, b, c);
        int max = getMax(a, b, c);
        System.out.println("Min = " + min + " Max = " + max);
    }

    static int getMin(int a, int b, int c) {
        int min = a > b ? b : a;
        min = min > c ? c : min;
        return min;
    }

    static int getMax(int a, int b, int c) {
        int max = a > b ? a : b;
        max = max > c ? max : c;
        return max;
    }
}
