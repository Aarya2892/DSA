package OOPS;

public class Inheritance {
    public static void main(String[] args) {
       Fish shark = new Fish();
       shark.eat();

       Dog lio = new Dog();
       lio.eat();
    //    lio.legs =4;
    //    System.out.println(lio.legs);
    }
}
//base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breath");
    }
}

//derived class
class Fish extends Animal{
    // int fins;

    void swim(){
        System.out.println("swims in water");
    }
}

//derived class
class Mamals extends Animal{ 
    // int legs;

    void walk(){
        System.out.println("walks");
    }
}
class Dog extends Mamals{
    String breed;
}

class Bird extends Animal{
    void fly(){
        System.out.println("Birds can fly");
    }
}