public class maxThree {
    public static void main(String[] args) {
        int[] arr;
          arr = new int[3]; 
            arr[0] = 5;
            arr[1] = 6;
            arr[2] = 1;
            int max = 0;

            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    
                    if (arr[i] > arr[j]) {
                         max = arr[i];
                    } else {
                        max = arr[j];
                    }
                }
            
            }
            System.out.println("The largest of 3 integers is: " + max); 

           
        
    }
}