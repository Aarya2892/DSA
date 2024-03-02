package OOPS;

public class Constructor {
    public static void main(String[] args) {
        // Student s1 = new Student("Aarya");
           // System.out.println(s1.name);
        Student s1 = new Student();
        s1.name = "Aarya";
        s1.roll =28;
        s1.password ="abcd";
        s1.marks[0] = 100;
        s1.marks[1]= 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1); //copy constructor
        s1.marks[1] = 100;
        s2.password = "xyz";
     
        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
       
    }
}

class Student{
    String name;
    int roll;
    String password;
    int marks[];

    //non-parameterised constuctor
    Student(){
        marks = new int[3];
        System.out.println("Constuctor is called");
    }

    // parameter constructor
    // marks = new int[3];
    // Student(String name){
    //   this.name = name;
    // } 

    //copy constructor
    //shallow copy constructor
    // Student(Student s1){
    //    marks = new int[3];
    //    this.name = s1.name;
    //    this.roll = s1.roll;
    //    this.marks = s1.marks;
    // }

    //deep copy constuctor
    Student(Student s1){
        marks = new int[3];
        this.name= s1.name;
        this.roll = s1.roll;
        for(int i=0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }
}
