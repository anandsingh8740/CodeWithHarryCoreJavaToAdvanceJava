class EKClass{
    int a ;

    public int getA() {
        return a;
    }
    EKClass(int v) {   // constructor
        // a = v;
        this.a = v; // This is a refrence
        /*
        this.txt ak aisa refrence hai jo ki class me avalable hai  ab ye jo e hai(niche obj) means jo
         ye e hai vo class me avalable to nahi hai ..This ak aisa reference hai jo ki class me avalable hai
         aur hame usi object per reference kar sakte hai jis per YE METHOD RUN HO RAHA HAI YA CONSTRUCTOR RUN
         HO RAHA HAI...MEANS USI OBJECT KO REFER KARNA hai any resion to ham istarah se kar sakte hai
         Ekclass(int a){
        this.txt.a = a;
        Aagar a = a; // likhate to compiler confuse h jata isliye bhi this.txt keyword ka use kiya jata hai
    }
    */
    }
    public int returnone(){   // method
        return 1;
    }
}
class DoClass extends EKClass{
    DoClass (int c){
        super(c); // yani mujhe super class ke us constractor ko call karna jai jo ki ak integer leta hai
        /*ye ak reference variable hai jo ki use hota hai immediate parent class ke object ko
        //refer karne ke liye  ...KUL MILA KA PARENTS CLASS KO ACCESS KARNE KELIYE USE HOTA HAI (LIKE CONS ,METHOD)
        System.out.println("Mai ek constructor hoon"); means parameterized jaha hoga parent class me
        use liye us hoga ..ye parameter vale ko hi access karta hai
        */
    }
}
public class this5super {
    public static void main(String[] args) {
        EKClass e = new EKClass(5);
        System.out.println(e.getA());
        DoClass d = new DoClass(65);
        System.out.println( e.getA());
    }
}
