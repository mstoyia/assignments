import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        double quarter = 0.25;     
        double dime = 0.10;
        double nickel = 0.05;
        double penny = 0.01;


        Scanner input = new Scanner(System.in);
        System.out.println("Enter US coins: ");
    
        double coinsEntered = input.nextDouble();
        input.close();
        
        int numQuarter = (int) (coinsEntered / quarter);
        coinsEntered = coinsEntered % quarter;
        int numDime = (int) (coinsEntered / dime);
        coinsEntered = coinsEntered % dime;
        int numNickel = (int) (coinsEntered / nickel);
        coinsEntered = coinsEntered % nickel;
        int numPenny = (int) (coinsEntered / penny);
        coinsEntered = coinsEntered % penny;

        System.out.println("Number of quarters: " + numQuarter);
        System.out.println("Number of dime:" + numDime);
        System.out.println("Number of nickels: " + numNickel);
        System.out.println("Number of pennies: " + numPenny);


        
        while (coinsEntered >= 0.01 && coinsEntered <= 0.99) {
            
          System.out.println(numQuarter);
          System.out.println(numDime);
          System.out.println(numNickel);
          System.out.println(numPenny);
        }         

    }
}
