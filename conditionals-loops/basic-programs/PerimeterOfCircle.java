
// Q. Perimeter of circle
import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14;
        System.out.print("Enter radius: ");
        int radius = input.nextInt();
        double perimeter = 2 * pi * radius;
        System.out.println("Perimeter of Circle  = " + perimeter);
    }
}
