// Q. Area Of Circle Java Program

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14;
        System.out.print("Enter radius of circle: ");
        double radius = input.nextDouble();
        double areaOfCircle = pi * (radius * radius);
        System.out.println("Area of cicrle = " + areaOfCircle);

    }
}
