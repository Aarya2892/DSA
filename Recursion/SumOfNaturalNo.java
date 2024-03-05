package Recursion;

public class SumOfNaturalNo {
    public static int sumofNatural(int n){
        if(n == 1){ 
            return 1;
        }
        int snm1 = sumofNatural(n-1);
        int sum = n + sumofNatural(n-1);
        return sum;
    }
    public static void main(String[] args) {
        int n =5;
        System.out.println(sumofNatural(n));
    }
}
