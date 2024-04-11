public class Prime {
    // Method to check if a number is a factor of another number
    public static boolean isFactor(int number, int remainingFactor) {
        return number % remainingFactor == 0;
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        // Prime numbers are greater than 1
        if (number <= 1) {
            return false;
        }
        // Checking for factors from 2 to the square root of the number
        for (int i = 2; i * i <= number; i++) {
            if (isFactor(number, i)) {
                return false;
            }
        }
        // If no factors are found, the number is prime
        return true;

    }

    public static void main(String[] args) {
        int num = 17;
        System.out.println(num + " is prime: " + isPrime(num));
    }
    
}
