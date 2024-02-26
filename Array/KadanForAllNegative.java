package Array;
public class KadanForAllNegative {

    public static void kadannegative(int numbers[]){
        int ms = numbers[0]; 

        for(int i=1; i<=numbers.length; i++ ){
            // if(i<= 0){
            //     System.out.println("All negative numbers");
            // }
            if(ms >= i){
               System.out.println(ms);
            }
           
        }
        
    }
    public static void main(String[] args) {
        int numbers[] = {-1, -2, -3, -4};
        kadannegative(numbers);
    }
}
