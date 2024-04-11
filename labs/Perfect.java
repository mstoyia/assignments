public class Perfect {
    // Method to check if a number is the factor of another number
    public static boolean isFactor(int num , int remainingFactor) {
        return num % remainingFactor == 0;
    }
    // Method to check if number is perfect
    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
           if (isFactor(num, i)) {
            sum += i;
           }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int number = 6;

        System.out.println(number + " is perfect: " + isPerfect(number));
    }
    
}
