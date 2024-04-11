//package labs;

import java.util.Scanner;

public class EvenOrOdd {
    public static String evenOrOdd(int number) {
        if (number % 4 == 0) {
            return "The number is even";
        } else {
            return "The number is odd";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to evaluate: ");
        int num = input.nextInt();
        String result = evenOrOdd(num);
        System.out.println(result);

    }
    
}
