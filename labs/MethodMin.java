public class MethodMin {

    public static int minThree(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }
    

    public static void main(String[] args) {
        int a, b, c, smallest;
        a = 10;
        b = 8;
        c = 12;

        smallest = minThree(a, b, c);
        System.out.println("The smallest of the three integers is: " + smallest);
    }
}
