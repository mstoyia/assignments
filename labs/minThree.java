public class minThree {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[3];
        arr[0] = 9;
        arr[1] = 15;
        arr[2] = 7;

        for (int i = 2; i < arr.length; i++) {
            System.out.println("The smallest of the three integers is: " + arr[i]);
        }
    }
}
