package Recursion;

public class PrintTheNumber {
    public static void printnumber(int n){
        //Normal solution
        // for (int i = n; i >0; i--) {
        //     System.out.print(i + " ");
        // }

        //Recursion
        if(n ==1){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printnumber(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        printnumber(n);
    }
}
