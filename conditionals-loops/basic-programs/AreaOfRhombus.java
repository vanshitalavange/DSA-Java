
// Q. Area Of Rhombus
import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of diagonal 1: ");
        int diagonalLength1 = input.nextInt();
        System.out.print("Enter length of diagonal 2: ");
        int diagonalLength2 = input.nextInt();
        int areaOfRhombus = (diagonalLength1 * diagonalLength2) / 2;
        System.out.println("Area of Rhombus = " + areaOfRhombus);

    }
}
