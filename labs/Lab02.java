import java.util.Scanner;

public class Lab02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choose = 0;
        
       
        do {
            System.out.println("Enter a number in the menu: ");
            System.out.println("1. Find the maximum value: ");
            System.out.println("2. Find the minimum value: ");
            System.out.println("3. Find the middle value ");
            System.out.println("4. Find the boolean value ");
            System.out.println("5. Find the factors of the value ");
            System.out.println("6. Find the perfect value ");
            System.out.println("7. Find the prime value ");
            System.out.println("8. Exit menu ");
            choose = input.nextInt();
            
            switch (choose) {
                case 1:
                    System.out.println("Enter the first number: ");
                    int a = input.nextInt();
                    System.out.println("Enter the second number: ");
                    int b = input.nextInt();
                    System.out.println("Enter the third number: ");
                    int c = input.nextInt();
                    int max = max3(a, b, c);
                    System.out.println("The maximum number of the three is: " + max);
                    break;
                case 2:
                    System.out.println("Enter the first number: ");
                    int a1 = input.nextInt();
                    System.out.println("Enter the second number: ");
                    int b1 = input.nextInt();
                    System.out.println("Enter the third number: ");
                    int c1 = input.nextInt();
                    int min = min3(a1, b1, c1);
                    System.out.println("The minimum number of the three is: " + min);
                    break;

                case 3:
                    System.out.println("Enter the first number: ");
                    int a2 = input.nextInt();
                    System.out.println("Enter the second number: ");
                    int b2 = input.nextInt();
                    System.out.println("Enter the third number: ");
                    int c2 = input.nextInt();
                    int mid = mid3(a2, b2, c2);
                    System.out.println("The middle number of the three is: " + mid);
                    break;

                case 4:
                    System.out.println("Are we going to the beach ?:");
                    boolean answer = input.nextBoolean();
                    System.out.println("Are we going on vacation ?: ");
                    boolean answer2 = input.nextBoolean();
                    boolean response = xor(answer, answer2);
                    System.out.println(response);
                case 5:
                    System.out.println("Enter a number: ");
                    int a3 = input.nextInt();
                    System.out.println("Enter a possible factor of a number: ");
                    int b3 = input.nextInt();
                    boolean factor = isFactor(a3, b3);
                    System.out.println(factor);

                case 6:

                case 7:
            
                default:
                    break;
            } break;
        } while (choose != 8); 
    }

    public static int max3(int a, int b, int c) 
    {
        int max = a;
        if (b > max ) {
            max = b;
        } if (c > max) {
            max = c;
        } 

        return max;
    }
       
    

    public static int min3(int a, int b, int c) 
    {
        int min = a;
        if (b < min) {
            min = b;
        } if (c < min) {
            min = c;
        }

        return min;
    }

    public static int mid3(int a, int b, int c) {
        int sum = a + b + c;

        int mid = sum - max3(a, b, c) - min3(a, b, c);
        return mid;
    }
    
    public static boolean xor(boolean x, boolean y) {
        if ((x || y) && !(x || y)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isFactor(int k, int n) {
        if (n % k == 0) {
            return true;
        }
        if (n % k != 0) {
            return false;
        } else {
            return false;
        }
    }

    public static int isPerfect(int a) {
        

    }
}
