// Q. Input currency in rupees and output in USD.

import java.util.Scanner;

public class RupeesToUSD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter currency in rupees: ");
        float rupees = input.nextFloat();
        float USD = rupees * 77.82f;
        System.out.println("Currency in USD = " + USD);
    }
}
