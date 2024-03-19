import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        double quarter = 0.25;     
        double dime = 0.10;
        double nickel = 0.05;
        double penny = 0.01;
        double totalAmount = 0.99;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter US coins: ");
    
        double coinsEntered = input.nextDouble();
        //double totalAmount = 0.99;
        coinsEntered = totalAmount / quarter;
        coinsEntered = totalAmount / dime;
        coinsEntered = totalAmount / nickel;
        coinsEntered = totalAmount / penny;

        quarter = (int) (totalAmount / quarter);
        dime = (int) (totalAmount / dime);
        nickel = (int) (totalAmount / nickel);
        penny = (int) (totalAmount / penny);


        System.out.println("Number of quarters given: " + quarter);
        System.out.println("Number of dimes given: " + dime);
        System.out.println("Number of nickels given: "  + nickel);
        System.out.println("Number of pennies give: "  + penny);

    }
}
