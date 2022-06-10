// Q. To find Armstrong Number between two given number.

import java.util.Scanner;

public class ArmstrongNumber {

    public static boolean checkArmstrong(int number) {
        int result = 0;
        int inputNumber = number;
        while (number > 0) {
            int temp = number % 10;
            result = result + temp * temp * temp;
            number = number / 10;
        }
        if (inputNumber == result) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int number1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int number2 = input.nextInt();
        boolean isNumber1Armstrong = checkArmstrong(number1);
        boolean isNumber2Armstrong = checkArmstrong(number2);
        if (isNumber1Armstrong && isNumber2Armstrong)
            System.out.println("Both numbers are Armstrong numbers");
        else if (isNumber1Armstrong)
            System.out.println(number1 + " is a ArmStrong number");
        else if (isNumber2Armstrong)
            System.out.println(number2 + " is a ArmStrong number");
        else
            System.out.println("No Armstrong number present");
    }
}
