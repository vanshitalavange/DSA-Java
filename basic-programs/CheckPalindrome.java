// Q. To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string: ");
        String inputString = input.nextLine();
        int length = inputString.length();
        String reverseString = "";
        for (int i = length - 1; i >= 0; i--) {
            reverseString = reverseString + inputString.charAt(i);
        }
        if (reverseString.equals(inputString)) {
            System.out.println("Yes it is a Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
