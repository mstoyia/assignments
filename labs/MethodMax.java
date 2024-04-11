public class MethodMax {
    
    public static int maxThree(int a, int b, int c) {
        if (a >= b && a >= c ) {
            return a;
        }else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
       

    }

    public static void main(String[] args) {
        int a, b, c, largest;
         a = 8;
         b = 10;
         c = 12;

        largest = maxThree(a, b, c);

        System.out.println("The largest of the three integers is: " + largest);
    }
    
}
