
// Q. Factorial Program In Java
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        int factorial = 1;
        while (num > 1) {
            factorial = factorial * num;
            num--;
        }
        System.out.println("Factorial = " + factorial);

    }
}
