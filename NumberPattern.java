public class NumberPattern {
    public static void main(String args[]){
        for(int i=1; i<=5; i++){
            //j=i because number is equal to the number of line;
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
