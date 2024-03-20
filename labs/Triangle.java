//package labs;

import java.util.Scanner;

public class Triangle {
    public static double calculateArea( double baseWidth, double height) {
      double area = baseWidth * height / 2; 
        return  
        area;

    }

   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
            System.out.println("Enter the baseWidth of the triangle: ");
            double baseWidth = input.nextDouble();

            System.out.println("Enter the height of the triangle: ");
            double height = input.nextDouble();

            System.out.println("The area of the triangle is: " + baseWidth *  height / 2);
             
            
            

   }
}
