
// Q. Calculate Electricity Bill
import java.util.Scanner;

public class CalculateElectricityBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total units consumed in kWh: ");
        int units = input.nextInt();
        if (units >= 1 && units <= 100) {
            System.out.println("Bill = " + units * 10);
        } else if (units > 100 && units <= 200) {
            System.out.println("Bill = " + units * 15);
        } else if (units > 200 && units <= 250) {
            System.out.println("Bill = " + units * 20);
        }
    }
}
