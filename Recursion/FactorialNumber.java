package Recursion;

public class FactorialNumber {
    public static int factorialNum(int n){
        if(n == 0){
            return 1;
        }
        int fnm1 = factorialNum(n-1);
        int fn = n * factorialNum(n-1);
        return fn;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorialNum(n));
    }
}
