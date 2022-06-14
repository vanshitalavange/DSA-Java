// Q. A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
package functions;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = input.nextInt();
        String result = isEligibleToVote(age) ? "Eligible" : "Not Eligible";
        System.out.println(result);
    }

    static boolean isEligibleToVote(int age) {
        return age >= 18;
    }
}
