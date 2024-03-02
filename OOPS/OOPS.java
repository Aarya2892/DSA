package OOPS;

public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen(); //created a pen object p1
        p1.setcolor("Blue");
        System.out.println(p1.getcolor());
        p1.settip(5);
        System.out.println(p1.gettip());
        p1.setcolor("Yellow");
        System.out.println(p1.getcolor());

        BankAccount myacc = new BankAccount();
        myacc.username ="aarya";
        // myacc.password = "abcd"
        myacc.setpass("abcdefgh");
        System.out.println(myacc.username);
    }
}

//Encapsulation
class BankAccount{
    public String username;
    // private String password;
    
    public void setpass(String newpass){
        // password = newpass;
    }
}
class Pen{
    //ptoperties
    private String color;
    private int tip;


    String getcolor(){
        return this.color;
    }
    int gettip(){
        return this.tip;
    }
    //function
    void setcolor(String newcolor){
        color = newcolor;
    }
    void settip(int newtip){
        tip = newtip;
    }
}