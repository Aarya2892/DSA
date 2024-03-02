package OOPS;

public class StaticKeyword {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.SchoolName = "JMV";

        Students s2 = new Students();
        System.out.println(s2.SchoolName);
    }
}
class Students {
    String name; 
    int roll;

    static String SchoolName;

    void setName(String name){
        this.name = name;
    }

    String getname(){
        return this.name;
    }
}