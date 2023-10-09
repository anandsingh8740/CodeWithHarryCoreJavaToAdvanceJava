/* Abstract class ak aisi class hai jisaki sahayata lekar aur classes banegi .. isne ak standard set kar diya
 Important :- abstract class ka object nahi ban sakta hai ..kyoki ye apne aap me koi class hai hi nahi
  ye to ak standard hai vo to ak jariya hai duasari classes ke liye ak class banane ka
  parent2 ak jariya hai child2 ke liye ak class banane ka ak actual class banane ka  concritr
  class banane ...abstract class help karta hai aur class ki
// Ak abstrsct class ak aisi class hai jisme KAM SE KAM AK ABSTRACT METHOD HO usme aur kuch concreat method
 bhi ho sakte hai jo ki alraedy implemented hai.lekin kam se kam ak method hoga jo abstarct
 hoga
 */
  abstract class Parent2{    // ak aisi class ham likhange jisko inharite kar karke bahut sari classes ban sakti hai
    public Parent2(){
        System.out.println("Mai base2 ka constructor hoon");
    }
    public void sayHello(){    // it is a method
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Child2 extends Parent2 {   // Ye ak concreate class hai
    @Override
    public void greet() {
        System.out.println("Good morning");
    }

    @Override
    public void greet2() {
        System.out.println("Good afternoon");
    }
}
    abstract class Child3 extends Parent2{
        public void th(){
            System.out.println("I am good");
        }
   }
public class a_9bstractClassAndMethod {
      public static void main(String[] args) {
         // Parent2 = new Parent2(); // not applicable ..because is is abstact class..abstarct calss ka obj nahi banata hau
         // Child3 c3 = new Child3(); //-- error throw
          Child2 c =new Child2();
      }
 }
// OUTPUT
//Mai base2 ka constructor hoon