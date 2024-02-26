package Array;
// import java.util.*;
public class Arrays{
//   public static void main(String[] args) {
//      int marks[] = new int[100];

//      System.out.println("Length of Array: " + marks.length);

//      //input
//      Scanner sc = new Scanner(System.in);
//      marks[0] = sc.nextInt(); //math
//      marks[1] = sc.nextInt(); //physics
//      marks[2] = sc.nextInt(); //chemistry

//      System.out.println("Math: " + marks[0]);
//      System.out.println("Physics: " + marks[1]);
//      System.out.println("Chemistry: " + marks[2]);
//      sc.close();

//      //update
//      marks[0] = 100;
//      System.out.println("Math: " + marks[0]);

//      //average
//      int percentage = (marks[0]+marks[1]+marks[2]) / 3;
//      System.out.println("Percentage: "+ percentage + "%");
     
//   }

public static void update(int marks[]){
    for (int i = 0; i < marks.length; i++) {
        marks[i] = marks[i] + 1;
        System.out.print(marks[i] + " ");
    }
   
}
public static void main(String[] args) {
    int marks[] ={97,96,95};
    update(marks);

    // for (int i = 0; i < marks.length; i++) {
    //     System.out.print(marks[i] + " ");
    // }
}
}