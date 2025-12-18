public class ReverseNumber {
    public static void main(String args[]) {
        int n = 1223344;
        while(n>0) {
            int LastDigit = n%10;
            System.out.print(LastDigit);
            n/=10;

        }
        System.out.println();
    }
    
}
