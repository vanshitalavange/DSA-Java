// 07. To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the nth number of the fibonacci series: ");
        int number = input.nextInt();
        int prevNumber = 0;
        int currentNumber = 1;
        System.out.print("Fibonacci series: " + prevNumber + " " + currentNumber);
        int i = 1;
        while (i < number) {
            int sum = prevNumber + currentNumber;
            System.out.print(" " + sum);
            prevNumber = currentNumber;
            currentNumber = sum;
            i++;
        }
    }
}
