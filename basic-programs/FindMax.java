
// 05. Take 2 numbers as input and print the largest number.
import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int number1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int number2 = input.nextInt();
        if (number1 > number2) {
            System.out.println("Maximum = " + number1);
        } else if (number1 < number2) {
            System.out.println("Maximum = " + number2);
        } else {
            System.out.println("Both are equal");
        }

    }
}