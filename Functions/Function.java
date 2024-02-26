import java.util.*;
public class Function {
    //syntax with parameters

    //sum
    public static int calculatesum(int a, int b){
        int sum = a+b;
        return sum;
    }

    //swap the number
    public static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;

        System.out.println("Value of a is: "+ a);
        System.out.println("Value of b is: "+ b);
    }

    //product
    public static int multiply(int a, int b){
        int Product = a*b;
        return Product;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculatesum(a,b);
        System.out.println("The sum is: "+ + sum  );
       

        //swap 
        // int a=10;
        // int b=5;
        // swap(a, b);

        // int product = multiply(a, b);
        // System.out.println("The product of a and b is: " + product);
        sc.close();
      
  }
}
