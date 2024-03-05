package Recursion;

public class PrintXpN {
    public static int printpow(int x, int n){
        if(n == 0){
            return 1;
        }
       int xpnm1= printpow(x, n-1);
       int xpn = x * xpnm1;
       return xpn;
    // return x * printpow(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println(printpow(2, 10));
    }
}
