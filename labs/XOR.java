public class XOR {
    public static boolean xor(boolean a, boolean b ) {
        return (a || b) && !(a && b);
    }
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        xor(x, y);
        System.out.println( "The xor is: (" + x + "," + y + ") = " + xor(x, y));
    }
}
