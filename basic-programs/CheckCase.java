
// Q. Check case of the entered string 
import java.util.Scanner;

public class CheckCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        char firstLetter = input.next().trim().charAt(0);
        if (firstLetter >= 'a' && firstLetter <= 'z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }
    }
}
