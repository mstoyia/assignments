import java.util.Scanner;

public class Integer {
    
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
         number = input.nextInt(); 
        System.out.println("You entered: " + number);
        double newValue = (double)number;
        System.out.println("The new value is: " + newValue);
  
        
        
    }
}
