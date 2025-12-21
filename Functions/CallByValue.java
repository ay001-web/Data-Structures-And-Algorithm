package Functions;

public class CallByValue {
    public static int swapping(int a ,int b) {
        int temp = a;
        a=b;
        b= temp;
        System.out.println("A =" +a);
        System.out.println("B =" +b);
        return 3;
        
    }
    public static void main(String args[]) {
        int a = 5;
        int b = 10;

        swapping(a,b);
    }
    
}
