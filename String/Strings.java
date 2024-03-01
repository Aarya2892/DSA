package String;

public class Strings {
    // public static void printLetters(String str){
    //     for(int i=0; i<str.length(); i++){
    //         System.out.print(str.charAt(i) + " ");
    //     }
    //     System.out.println();
    // }
    public static void printLetters(char arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'd'};

        // String str = "abcd";
        // System.out.println(str);
        // String str2 = new String("xyz@#&8pil");
        // System.out.println(str2);

        // Scanner sc= new Scanner(System.in);
        // // String name = sc.next(); //for single word only
        // // System.out.println(name); 

        // String fullName = sc.nextLine();
        // System.out.println(fullName);
        // sc.close();

        // String fullname = "Aarya Dayanand Patil";
        // System.out.println(fullname.length());

        //concatenation
        String firstName = "Aarya";
        String lastName = "Patil";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName.charAt(4));

        // printLetters(fullName);
        printLetters(arr);

    }
}
