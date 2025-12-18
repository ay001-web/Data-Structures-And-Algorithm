package Loops;
public class ReverseNumber2 {
    public static void main(String args[]) {
        int n = 22456;
        int rev = 0;
        while(n>0) {
            int LastDigit = n % 10;
          rev = (rev*10) + LastDigit;
            n/=10;
            
        }
        System.out.println(rev);
    }
    
}
