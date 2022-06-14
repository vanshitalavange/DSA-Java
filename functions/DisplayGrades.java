// Q. Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
package functions;

import java.util.Scanner;

public class DisplayGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter marks out of 100 for 5 subjects: ");
        String[] grades = new String[5];
        int[] marks = new int[5];
        int i = 0;
        while (i < 5) {
            System.out.println("Enter marks of subject " + (i + 1));
            int score = input.nextInt();
            marks[i] = score;
            grades[i] = getGrade(score);
            i++;
        }
        System.out.println("Marks    Grades");
        for (int j = 0; j < 5; j++) {
            System.out.println(marks[j] + "        " + grades[j]);
        }
    }

    static String getGrade(int score) {
        String grade = "";
        if (score >= 91 && score <= 100) {
            grade = "AA";
        } else if (score >= 81 && score <= 90) {
            grade = "AB";
        } else if (score >= 71 && score <= 80) {
            grade = "BB";
        } else if (score >= 61 && score <= 70) {
            grade = "BC";
        } else if (score >= 51 && score <= 60) {
            grade = "CD";
        } else if (score >= 41 && score <= 50) {
            grade = "DD";
        } else if (score <= 40) {
            grade = "FAIL";
        }
        return grade;
    }

}
