package OOPS;

public class SuperKeyword {
    public static void main(String[] args) {
        Horse h = new Horse();
       System.out.println(h.color);
    }
}
class Animal2{
    String color;
    Animal2() {
        System.out.println("Animal Constuctor is called");
    }
}
class Horse extends Animal2{
    Horse(){
        super.color = "Browm";
        System.out.println("Horse Constuctor is called");
    }
}