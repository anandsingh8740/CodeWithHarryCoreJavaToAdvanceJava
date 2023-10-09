
class Base1{
    Base1(){
        System.out.println("I am a constructor");
    }
   // constructor overloading
    Base1(int x){
        System.out.println("I am an overloaded  constructor with value of x as :" +x);
    }
}
class Derived1 extends Base1{
    Derived1(){
        //super(0); // super key ka use ham OVERLOADED CONSTRUCTOR(like argument vala constructor)
        // KO ACCESS karne ke liye use karte hai
        System.out.println("I am a derived class constructor");
    }
    Derived1(int x , int y){
        super(x); // super means ye super class me jayega means super class ke constructor ko call karo
        System.out.println("I am an overloaded  constructor of derived with value of y as :" +y);
    }
}
 class ChildOfDerived  extends Derived1{
     ChildOfDerived(){
         System.out.println("I am a  child of derived class constructor");
     }
     ChildOfDerived(int x , int y , int z){
         super(x,y);
         System.out.println("I am an overloaded  constructor of derived with value of z as :" +z);
     }

 }
public class C4onstructorsInharitance {

    public static void main(String[] args) {
       // Base1 b = new Base1();
       // Derived1 d = new Derived1();
        /*jab ham derived class ka ak new object banaya to BASE CLASS KA
        CONSTRUCTOR TO RUN HOTA HI HOTA HAI aur derived class ka constructor bhi run hota hai lekin pahle
         aur pahle koin sa constructor ran hota ..PAHLE CONSTRUCTOR RUN HOTA HAI BASE CLASS KA AUR PHIR
        AUR PHIR RUN HOTA HAI DERIVED CLASS KA
                */
        //Derived1 d = new Derived1(14 , 9);
        ChildOfDerived cd = new ChildOfDerived(12 , 13 ,14);

    }
}
/*
Output
I am an overloaded  constructor with value of x as :12
I am an overloaded  constructor of derived with value of y as :13
I am an overloaded  constructor of derived with value of z as :14

 */
