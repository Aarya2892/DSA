public class PrimeInRange {
    public static boolean isPrime(int n){
        boolean isPrime = true;
        if(n == 2){
          isPrime = true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                isPrime = false;
            }
        }
        return isPrime;
    }
    public static void PrimeInrange(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i+ " ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
      PrimeInrange(20);
    }  
}
