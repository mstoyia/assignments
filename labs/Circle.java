//package labs;

import java.util.Scanner;

public class Circle {

    public static double calculate(double radius, double area, double circumference) {
        area = Math.PI * radius * radius;
        circumference = 2 * radius * Math.PI;
        return radius;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:  ");
          double radius = input.nextDouble();
          double area = Math.PI * (radius * radius);
          double circumference = Math.PI * 2 * radius;
          input.close();


          System.out.println("The area of the circle is: " + area);
          System.out.println("The circumference of the circle is: " + circumference);
    }
}
