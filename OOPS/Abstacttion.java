package OOPS;

public class Abstacttion {
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();
        // System.out.println(c.color);

        //Animal --> Horse --> Mustang
        // Mustang myHorse = new Mustang();
    }
}
 abstract class Animal{
    String  color;

    //Constuctor 
    Animal(){
       System.out.println("Animal Constructor called");
    }
    void eat(){
        System.out.println("Animal eats");
    }

    abstract void walk();
 }

 class Horse extends Animal{
    Horse(){
        System.out.println("Horse Constructor called");
    }
    void changecolor(){
        color = "dark-brown";
    }
    void walk(){
        System.out.println("Horse walk on 4 legs");
    }
 }
 class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
 }

 class Chicken extends Animal{
    void changecolor(){
        color = "White";
    }
    void walk(){
        System.out.println("Chicken walks on 2 legs");
    }
 }