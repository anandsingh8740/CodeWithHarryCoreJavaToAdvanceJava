
/*
Interface in english is a point where two systems meet and interact.
In java, interface is a group of related methods with empty bodies.
Interface ke object nahi ban sakta hai but refrence ban sakta hai
jab hamlog Interface ko implement karte hai to implements keyword ka use karte hai
jab hamlog inharits karte hai to ham extends keyword ka use karte hai
abstract class me kuch nonabstract class hosakte hai aur interface ke ander sare ke sare method
abstract hai yani ki inko implement karna hi karna hai
 */
/*
 Difference b/w abstract class and interface
 Interface ko ham ak se jada implement kar sakte hai lekin jo abstract class hai vo shirf ak extends  kar "main diff hai yehi"
 sakte hai ...yani ki  ak parents se ak child banega ...lekin bahut sare interfaces ko ak sath
 use karke  ham class bana sakte hai... aur USI KE SATH SATH AK CLASS EXTEND BHI KAR SAKTE HAI
 */

interface Bicycle {
    // Interface banane keliye ham class ki jagah interface likhange ause bad interface name
    int a = 45;    // ham yaha ak properties bhi dal sakte hai ..like this.txt

    void applyBreak(int decrement);

    /* ye decleration hai ..ye interface, force kar raha hai jo bhi class isko implement kargi
    usper kahega kya force kar raha hai ki IN METHOD ko implement karo.. means agar tum Bycle
    ko implement kar rahe ho to applyBreak() and speedUP() method ko implement karo  yani ki
    inli body banavo ,inko define karo
    */
    void speedUp(int increment);  // isko bhi force karta hai implement karne ke liye
}
    interface HornBicycle{
        void blowHornK3g();
        void blowHornmhn();
    }
 class AvonCycle implements Bicycle,HornBicycle {
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBreak(int decrement){ // jab ham interface ke method ko implement karege to
        //to hamlogo ko inko public banana padega
        System.out.println("Apply Break");
    }
    public void speedUp(int increment){
        System.out.println("Applying speedUP");
    }
    //public void blowHorn3g(){
      //  System.out.println("kabhi khusi kabhi gum pee pee pee");
    //}

     @Override
     public void blowHornK3g() {
         System.out.println("kabhi khusi kabhi gum pee pee pee");
     }

     public void blowHornmhn(){
        System.out.println("Mai hoon naa po po po po");
    }
}
public class i_10nterfaces {
    public static void main(String[] args) {
        AvonCycle cycleHarry = new AvonCycle();
        cycleHarry.applyBreak(1);
        //cycleHarry.blowHorn();
        //You can create properties in Interfaces
       // System.out.println(cycleHarry.a);
        //You cannot modify the properties in Interfaces as they are final(kyoki ye final hoti hai)
        //cycleHarry.a = 454; //not O/P means ham ak bar declear karne ke bad change nahi kar sakte
        // Important :- jitani bhi chig ham interface me banate hai vo final hoti ham use mofify nahi kar sakte hai
       // System.out.println(cycleHarry.a);
        cycleHarry.blowHornK3g();
        cycleHarry.blowHornmhn();
    }
}

/*
OUTPUT
Apply Break
kabhi khusi kabhi gum pee pee pee
Mai hoon naa po po po po
 */

// interface tab ham use karte hai jab koi chige kisi chige ke taur per use ki ja sakti hai
// ki smartphone ak cellPhone hai aur smartphone ak gps device,camara.. ke taur per use kiya ja sakta
// hai