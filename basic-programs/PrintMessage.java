
// 02. Take name as input and print a greeting message for that particular name.
import java.util.Scanner;

public class PrintMessage {
    public static void main(String[] args) {
        Scanner nameInput = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = nameInput.next();
        System.out.println(name + " " + "Start learning, data structures and algorithms");
    }
}
