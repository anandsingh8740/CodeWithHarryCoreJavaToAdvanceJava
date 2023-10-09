/*
Question3
 */

abstract class Pen1{
    abstract void write();
    abstract void refile();
}
class FountainPen1 extends Pen{
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
class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello sir!");
    }
    public void eat(){
        System.out.println("Eating");
    }
    public void sleep(){
        System.out.println("sleeping");
    }
}
public class p15ractics {
    public static void main(String[] args) {
        // Q1 + Q2
        FountainPen pen = new FountainPen();
        pen.changeNib();

        // Q3
        Human harry = new Human();
        harry.sleep();
        // Q5 Demonstrate polymorphism using monkey class from Q3
        // yaha monkey ka to ham refrence banayege .. jo human hai use ham monkey ki tarah use karege
        Monkey m1 = new Human();  //  yaha hamne monkey maga hai ..to mankey bolega nahi (speak)to error ayega
        m1.jump();
        m1.bite();
       // m1.speak();   --> cannot use speak method because the referance is monkey which does
        // not have speak method
        BasicAnimal lovish = new Human();
        // lovish.speak(); --> error ayega kyoki lavish keval eat aur sleep kar sakta hai speak nahi
        lovish.eat();
        lovish.sleep();

    }
}

/*
OUTPUT:-
Change the nib
sleeping
Jumping...
Biting...
Eating
sleeping 
 */
