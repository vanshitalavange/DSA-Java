
// Q. Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
import java.util.Scanner;

public class SumOfDifferentNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sumOfNegativeNumbers = 0;
        int sumOfEvenPositive = 0;
        int sumOfOddPositive = 0;
        while (true) {
            System.out.print("Enter number: ");
            int num = input.nextInt();
            if (num == 0)
                break;
            else {
                if (num < 0) {
                    sumOfNegativeNumbers = sumOfNegativeNumbers + num;
                } else if (num % 2 == 0) {
                    sumOfEvenPositive = sumOfEvenPositive + num;
                } else {
                    sumOfOddPositive = sumOfOddPositive + num;
                }
            }
        }
        System.out.println("Sum of Negative numbers = " + sumOfNegativeNumbers);
        System.out.println("Sum of Even Positive numbers = " + sumOfEvenPositive);
        System.out.println("Sum of Odd Positive numbers = " + sumOfOddPositive);
    }
}
