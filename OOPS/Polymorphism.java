package OOPS;

public class Polymorphism {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.sum(1, 2));
        System.out.println(cal.sum( (float)4.5, (float)4.5));
        System.out.println(cal.sum(3, 4, 5));

        Deer d = new Deer();
        d.eat();
    }
}

//Method Overloading
class Calculator{
    int sum (int a, int b){
        return a + b;
    }

    float sum(float a, float b){
        return  a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
}

//Method Overriding
class Animal1{
    void eat(){
        System.out.println("Animals can its anything");
    }
}

class Deer extends Animal1{
    void eat(){
        System.out.println("Deers its grass only");
    }
}
