import java.util.ArrayList;
public class Classroom {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3); 
        list1.add(4); 
        list1.add(5); 
        list2.add("apple");
        list2.add("banana");
        list3.add(true);
        list3.add(false);

        list1.add(1,9);
        int element = list1.get(2);
        list2.remove(1);
        list1.set(2, 10);
        //contain to check the element is present in array or not
        System.out.println(list1.contains(12));

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

        System.out.println(element);
        System.out.println("Size of an array: " +list1.size());

        //print the arraylist
        for(int i=0; i<list1.size(); i++){
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();
    }
}
