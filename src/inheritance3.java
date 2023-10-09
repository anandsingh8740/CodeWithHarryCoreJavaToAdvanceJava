//Inheritance is used to barrow properties and methods from an existing class.
 class Base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }
    public void printMe(){
        //sout ..ctrl+space
        System.out.println(" I am a Constructor");
    }
}
// extends Base ... likhane se sari Base ki chige niche vale class me avalabile hojayegi ..like derived class me
// chahe vo int ,floats ,methode ho rahe ki kare    DERIVED CLASS base class se lelegi
// aur kuch aur add karna chahe ho derive class apne ander add kar sakti hai
class Derived extends Base{      // extends keyword ka use karke ham base ko inharits karte hai
    // base Derive ke pita ji kam name hai
    // means agar ham Base me kuch change karge to derive me automatically chang hojayega
   public  int y;

    public int getY() { // ye integer return karega to ise hame print bhi karna padega
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class inheritance3 {
    public static void main(String[] args) {
        // Creating an object of base class
        Base b = new Base();
        //Derived b  = new Derived(); // isko bhi ham use karke same output payege //
        // isse clear hota hai ki hamare base class ki sari properties derived class me hai
        b.setX(4);
        System.out.println(b.getX());

        // Creating an object of derived class
        Derived d = new Derived();
        d.setX(43);
        System.out.println(d.getX());
        // base se ham Y ko access nahi kar sakte hai
        // Derived ke ander ham Y ko access kar sakte hai
        Derived e = new Derived();  // Y KO check kar sakte hai
        e.setY(46);
        System.out.println(e.getY()); // YAHA DERIVED Y KO ACCESS KAR RAHA HAI

    }
}
/*
OUTPUT :-
I am in base and setting x now
4
I am in base and setting x now
43
46

 */
