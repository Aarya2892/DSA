package Array;
public class BinarySearch {
    public static int binarysearch(int numbers[], int target){
        int start = 0;
        int end = numbers.length-1;

        while (start<=end) {
            int mid = start+(end-start)/2;
            // int mid = (start+end)/2;

            if(mid==target){
                return mid;
            }else if(target >numbers[mid]){
                start = mid+1;
            }else if(target < numbers[mid]){
                end = mid -1;
            }else{
                return mid;
            }
        }
        return -1;
    }
   public static void main(String[] args) {
    int numbers[] = {2,3,5,6,7,8,9,12,16};
    int target= 6;
    int ans = binarysearch(numbers, target);
    System.out.println(ans);
   }
}
