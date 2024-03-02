package OOPS;

public class Interfaces {
    public static void main(String[] args) {
         Queen q = new Queen();
         q.moves();

         Bear b = new Bear();
         b.eats();
    }
}

interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
   public void moves(){
        System.out.println(" up, down, left, right, diagonal (in all direction)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
         System.out.println(" up, down, left, right");
     }
 }
 class King implements ChessPlayer{
    public void moves(){
         System.out.println(" up, down, left, right, diagonal ( by 1 step)");
     }
 }

 //Multiple inheritance example
 interface Herbivers{
     void eats();
 }
 interface Carnivors{
    void eats();
 }

 class Bear implements Herbivers, Carnivors{
     public  void eats(){
        System.out.println("Eats both grass and meat");
       }
 }