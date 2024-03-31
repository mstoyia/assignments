import java.util.Scanner;

public class Double {
    public static void main(String[] args) {
        double num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a double number: ");
        num = input.nextDouble();
        System.out.println("You've entered: " + num);
        int wholeNum = (int)num;
        System.out.println("The new value is: " + wholeNum);

    }
}
