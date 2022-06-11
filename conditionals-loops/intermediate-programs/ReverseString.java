// Q. Reverse a string
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = input.nextLine();
        int length = inputString.length();
        String reverseString = "";
        for (int i = length - 1; i >= 0; i--) {
            reverseString = reverseString + inputString.charAt(i);
        }
        System.out.println("Reverse string = " + reverseString);
    }
}
