
// Q. Area Of Rectangle Program
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length: ");
        int length = input.nextInt();
        System.out.print("Enter breadth: ");
        int breadth = input.nextInt();
        int areaOfRectangle = length * breadth;
        System.out.println("Area of Rectangle = " + areaOfRectangle);
    }
}
