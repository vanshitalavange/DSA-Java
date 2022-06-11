
//  Q. Perimeter Of Equilateral Triangle
import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side of triangle: ");
        int side = input.nextInt();
        int perimeter = 3 * side;
        System.out.println("Perimeter of Equilateral Triangle = " + perimeter);
    }
}
