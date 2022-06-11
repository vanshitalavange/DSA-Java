
// Q. Perimeter Of Parallelogram
import java.util.Scanner;

public class PerimeterOfParellelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base: ");
        int base = input.nextInt();
        System.out.println("Enter side: ");
        int side = input.nextInt();
        int perimeter = 2 * (base + side);
        System.out.println("Perimeter of Parellelogram = " + perimeter);

    }
}
