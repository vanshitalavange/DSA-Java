import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total number of subjects: ");
        int totalSubjects = input.nextInt();
        int cgpaTotal = 0;
        for (int i = 0; i < totalSubjects; i++) {
            System.out.println("Enter grades of subject " + (i + 1));
            int marks = input.nextInt();
            cgpaTotal = cgpaTotal + (marks / 10);
        }
        double cgpaAverage = cgpaTotal / totalSubjects;
        System.out.println("CGPA = " + cgpaAverage);

    }
}
