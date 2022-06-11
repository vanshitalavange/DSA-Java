
// Q. Area Of Parallelogram
import java.util.Scanner;

public class AreaOfParellelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = input.nextInt();
        System.out.print("Enter height: ");
        int height = input.nextInt();
        int areaOfParellelogram = base * height;
        System.out.println("Area of Triangle = " + areaOfParellelogram);
    }
}