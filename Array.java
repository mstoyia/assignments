import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
       // Scanner input = new Scanner(System.in);
        // declared an array
        String[] cars = new String[4];
        // assigned variables a value
        cars[0] = "Volvo";
        cars[1] = "BMW";
        cars[2] = "Cadillac";
        cars[3] = "Honda";

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
       // System.out.println("Enter number of cars: ");
    }
    
}
