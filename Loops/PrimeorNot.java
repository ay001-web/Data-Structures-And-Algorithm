package Loops;
import java.util.*;
public class PrimeorNot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number");
        int n = sc.nextInt();
        if(n==2) {
            System.out.println("Number is a prime number");
        }
        else {
            boolean isPrime = true;
        for(int i = 2; i<=n-1; i++ ) {
            if(n%i==0) {
                isPrime = false;
            }
        }
        if(isPrime == true) {
            System.out.println("Number is a prime number");
        }
        else {
            System.out.println("Number is not a prime number");
        }

        }
    }
    
}
