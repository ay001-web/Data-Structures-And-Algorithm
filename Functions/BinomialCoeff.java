package Functions;
public class BinomialCoeff {
    public static int Factorial(int n) {
        int f = 1;
        for(int i = 1; i<=n ; i++) {
              f = f*i;
        }
        return f;
    }
    public static  int BinCoeff(int n,int r) {
        int fact_n = Factorial(n);
        int fact_r = Factorial(r);
        int fact_nmr = Factorial(n-r);
        int Bincoeff = fact_n/(fact_nmr*fact_r);
        return Bincoeff;


    }
    public static void main(String args[]) {
        System.out.println(BinCoeff(5,2));
    }
}