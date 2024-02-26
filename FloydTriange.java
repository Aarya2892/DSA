public class FloydTriange {

    public static void main(String argd[]){
        int n=5;
        int m = 1;
        for(int i=1; i<=n; i++){
           for(int j=1; j<=i; j++){
            System.out.print(m + " ");
                m++;
           }
           System.out.println();
        }
    }
}
