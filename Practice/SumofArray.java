package Practice;

public class SumofArray {
        public static int sum(int arr[]){
            int sum =0;
            for(int i=0; i<arr.length; i++){
              sum = sum+ arr[i];
            }
            return sum;
        }
        public static void main(String[] args) {
            int arr[] ={1, 2 ,3, 4, 10, 11};
            System.out.println(sum(arr));
        }
    }
