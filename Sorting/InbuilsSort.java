package Sorting;
import java.util.Arrays;
import java.util.Collections;

public class InbuilsSort {
    // public static int compare(int a, int b){
    //     //a < b -ve
    //     //a==b 0
    //     //a> b +ve
    //     return b-a;
    // }
    public static void main(String[] args) {
        //Increasing order
        int arr[] = {5, 4, 1, 3, 2};
        Arrays.sort(arr);
        // Arrays.sort(arr, 0, 3);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

    //Decreasing Order
    Integer arr1[] = {5, 4, 1, 3, 2};
    Arrays.sort(arr1, Collections.reverseOrder());
    // Arrays.sort(arr1, 0, 3, Collections.reverseOrder());
    for (int i = 0; i < arr.length; i++) {
                System.out.print(arr1[i]+ " ");
            }
            System.out.println();
    }
}
