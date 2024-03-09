package Recursion;

public class FriendsPairingPro {
    public static int friendspairing(int n){
        //base case
         if(n ==1 || n==2){
            return n;
         }
        // //choice
        // //single 
        // int fnm1 = friendspairing(n-1);

        // //pairing 
        // int fnm2 = friendspairing(n-2);
        // int pairsways = (n-1) * fnm2;

        // //total ways
        // int totways = fnm1 + pairsways;
        // return totways;

        return friendspairing(n-1) + (n-1) * friendspairing(n-2);
    }
    public static void main(String[] args) {
      System.out.println( friendspairing(3));
    }
}
