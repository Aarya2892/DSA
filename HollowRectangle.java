public class HollowRectangle {
    public static void hollow_rectangle(int totrow, int totcol){
        //outer loop
        for(int i=1; i<=totrow; i++){
            //inner loop
            for(int j=1; j<=totcol; j++){
                //cell-(i,j)
                if(i==1 || i==totrow || j==1 || j==totcol){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        hollow_rectangle(4, 5);
    }
}
