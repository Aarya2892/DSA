import java.util.*;
public class Matrices {
    //smallest number in 2D array
    //greatest number in 2D array

    //search element in 2D array
    public static boolean search(int matrix[][] ,int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
              if(matrix[i][j] == key){
                System.out.println("found at cell (" + i + "," + j + ")");
                return true;
              }
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);
        
        // int n = 3;
        // int m = 3;

        int n = matrix.length; int m = matrix[0].length;
        //outer loop
        for(int i=0; i<n; i++){
            //inner loop
            for(int j=0; j<m; j++){
               matrix[i][j] = sc.nextInt();
            //    System.out.print(matrix[i][j] + " ");
            }
            // System.out.println();
        }

        //output
        for(int i=0; i<n; i++){
            //inner loop
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix, 5);
        sc.close();
    }
}
