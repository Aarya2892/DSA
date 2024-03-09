package Recursion;

public class PrintXpN {
    //Problem 9
    // public static int printpow(int x, int n){
    //     if(n == 0){
    //         return 1;
    //     }
    //    int xpnm1= printpow(x, n-1);
    //    int xpn = x * xpnm1;
    //    return xpn;
    // // return x * printpow(x, n-1);
    // }
    // public static void main(String[] args) {
    //     System.out.println(printpow(2, 10));
    // }

    //Problem 10
    public static int pow(int x, int n){
        if(n == 0){
            return 1;
        }
        int halfpow = pow(x, n/2);
        int halfpowsqr =  halfpow * halfpow;

      //n is odd
      if(n %2 != 0){
        halfpowsqr = x * halfpowsqr;
      }
      return halfpowsqr;
    }
    public static void main(String[] args) {
        int x= 2;
        int n =10;
        System.out.println(pow(x, n));
    }
}
