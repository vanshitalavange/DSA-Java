//Q. Program to print even days in a month

import java.util.Scanner;

public class EvenDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter month: ");
        String month = input.next();
        switch(month){
            case "January", "March", "May", "July", "August", "October", "December" -> System.out.println("No. of even days = "+(31/2));
            case "September", "April", "June", "November" -> System.out.println("No. of even days = 15");
            case "February" -> System.out.println("No. of even days = 14");
            default -> System.out.println("Enter a valid month");
        }
    }
}
