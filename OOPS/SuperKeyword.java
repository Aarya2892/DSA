package OOPS;

public class SuperKeyword {
    public static void main(String[] args) {
        Horse h = new Horse();
       System.out.println(h.color);
    }
}
class Animal{
    String color;
    Animal() {
        System.out.println("Animal Constuctor is called");
    }
}
class Horse extends Animal{
    Horse(){
        super.color = "Browm";
        System.out.println("Horse Constuctor is called");
    }
}