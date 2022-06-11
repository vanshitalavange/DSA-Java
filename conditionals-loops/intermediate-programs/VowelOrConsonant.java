
// Q. Check Vowel or Consonant
import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        char ch = input.next().trim().toLowerCase().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("VOWEL");
        } else {
            System.out.println("CONSONANT");
        }
    }
}
