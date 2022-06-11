
// Q. Area of Equilateral Triangle
import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side of triangle: ");
        int side = input.nextInt();
        double areaOfEquilateralTriangle = (Math.sqrt(3) / 4) * (side * side);
        System.out.println("Area of Equilateral Triangle = " + areaOfEquilateralTriangle);
    }
}
