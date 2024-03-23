import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        String value;
        int ascii;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter of the alphabet:");
         value = input.nextLine(); 

         char letter = value.charAt(0);
         ascii = (int)letter;

          System.out.println("The ascii value is: " + ascii);
        
        
    }
}
