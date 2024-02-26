public class InversePattern {
    public static void main(String args[]){
        // for(int i=4; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        int n=4;
        for(int i=1; i<=n; i++){
            for(int s=1; s<=(n-i+1); s++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
