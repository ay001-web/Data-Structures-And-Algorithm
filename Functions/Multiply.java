package Functions;

public class Multiply {
    public static int Multiplication(int a,int b) {
        int product = a*b;
        return product;

    }
    public static void main(String args[]) {
        int a =5;
        int b =10;
        int prod=Multiplication(a,b);
        System.out.println("a*b= " +prod);
    }
    
}
