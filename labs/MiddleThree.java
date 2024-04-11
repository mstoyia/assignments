public class MiddleThree {

    public static int middleThree(int a, int b, int c) 
    {

    int num = a + b + c;
    return num - c - b;
     
    }

    public static void main(String[] args) {
        int a, b, c, middle; 
        a = 12;
        b = 9;
        c = 15;

        middle = middleThree(a, b, c);
        
    
        System.out.println("The middle integer is: " + middle);
    }
  
         
}
