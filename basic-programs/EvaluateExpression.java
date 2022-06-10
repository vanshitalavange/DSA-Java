
// Q. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;

public class EvaluateExpression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter operand 1: ");
        float operand1 = input.nextFloat();
        System.out.print("Enter operand 2: ");
        float operand2 = input.nextFloat();
        System.out.print("Enter operator : ");
        String operator = input.next();
        float result = 0;
        if (operator.equals("+")) {
            result = operand1 + operand2;
        } else if (operator.equals("-")) {
            result = operand1 - operand2;
        } else if (operator.equals("*")) {
            result = operand1 * operand2;
        } else if (operator.equals("/")) {
            result = operand1 / operand2;
        }
        System.out.println("Result = " + result);
    }
}