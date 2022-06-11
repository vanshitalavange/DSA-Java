
// Q. Calculate Average Of N Numbers
import java.util.Scanner;

public class AverageOfN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total numbers: ");
        int totalNumbers = input.nextInt();
        int numbers[] = new int[totalNumbers];
        int sum = 0;
        for (int i = 0; i < totalNumbers; i++) {
            System.out.println("Enter number " + (i + 1));
            int numInput = input.nextInt();
            sum = sum + numInput;
            numbers[i] = numInput;
        }
        int average = sum / totalNumbers;
        System.out.println("Average of " + totalNumbers + " numbers" + " = " + average);
    }
}
