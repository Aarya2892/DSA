package Array;
public class LinearSearch {

    //Find a number in array
    // public static int linearsearch(int numbers[], int target){
    //     for(int i=0; i<=numbers.length; i++){
    //         if(numbers[i]== target){
    //          return i;
    //         }
    //     }
    //     return -1;
    // }
    // public static void main(String[] args) {
    //     int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16};
    //     int target = 10;

    //     int index = linearsearch(numbers, target);
    //     if(index == -1){
    //         System.out.println(" not found");
    //     }else{
    //     System.out.println("Target element at the index: " + index);
    //     }
    // }

    //find the string in the given array
    public static String linearsearch(String name[], String element){
        for(int  i=0; i<=name.length; i++){
            if(element.equals(name[i])){
                return element;
            }
        }
        return "null";
    }
    public static void main(String[] args) {
        String name[]= {"Dosa", "Samosa", "pizza"};
        String element = "pizza";

        String index = linearsearch(name, element);
        // if(index == "a"){
        //     System.out.println("The element at the index: " + index);
        // }else{
        //     System.out.println("Element not found");
        // }
        System.out.println("The element at the index: " + index);
    }
}
