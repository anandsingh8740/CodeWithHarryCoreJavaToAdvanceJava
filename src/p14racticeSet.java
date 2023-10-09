 /*
    Chapter 11 - Practise Set
 Create an abstract class Pen with methods write() and refill() as abstract method
 use the Pen class from Q(1) to create a concrete class FountainPen with additional method
 changeNib()
  */
 abstract class Pen{
     abstract void write();
     abstract void refile();
 }
 class FountainPen extends Pen{
     void write(){
         System.out.println("Write");
     }
     void refile() {
         System.out.println("Refill");
     }
     void changeNib(){
         System.out.println("Change the nib");
     }
 }
public class p14racticeSet {
    public static void main(String[] args) {
       FountainPen pen = new FountainPen();
       pen.changeNib();
    }
}
