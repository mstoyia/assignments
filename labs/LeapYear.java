import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        year = input.nextInt();

        if ((year % 4 == 0) || ((year % 100 == 0) && (year % 400 == 0))) {
            System.out.println("The year is a leap year(it has 366 days)." );
        } else {
            System.out.println("the year is not a leap year(it has 365 days).");
        }
    }
    
}
