public class IsFactor {
    public static boolean isFactor(int k, int n) {
        if (n % k == 0) {
            return true;
        } else {
            return false;
        }        
        
    }

    public static void main(String[] args) {
        int k = 10;
        int n = 20;
         isFactor(k, n);
        System.out.println("The factors k and n is: " + isFactor(k, n));

    }
}
