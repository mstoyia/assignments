public class minThree {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[3];
        arr[0] = 9;
        arr[1] = 15;
        arr[2] = 7;

        int min = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    min = arr[i];
                }else {
                    min = arr[j];
                }
           }
        }
        System.out.println("The smallest of the three integers is: " + min);
          
    }
}
