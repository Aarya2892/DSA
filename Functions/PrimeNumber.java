import java.util.*;
public class PrimeNumber {
    // public static boolean isPrime(int n){
        public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
         
        System.out.println(isPrime(n));

        //first Method
        if(n %2 ==0){
            System.out.println(n + " is not prime number");
        }else{
            System.out.println(n + " is the prime number");
        }
        sc.close();
    }
}
