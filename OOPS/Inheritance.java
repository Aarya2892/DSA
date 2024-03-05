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
class Animals{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breath");
    }
}

//derived class
class Fish extends Animals{
    // int fins;

    void swim(){
        System.out.println("swims in water");
    }
}

//derived class
class Mamals extends Animals{ 
    // int legs;

    void walk(){
        System.out.println("walks");
    }
}
class Dog extends Mamals{
    String breed;
}

class Bird extends Animals{
    void fly(){
        System.out.println("Birds can fly");
    }
}