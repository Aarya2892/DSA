public class StarPattern {
    public static void main(String args[]){
        for(int i=1; i<=4; i++){
            //print one line
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //for next line
            System.out.println();
        }
    }
}
