package ArrayList;
 import java.util.*;
public class A_1rrayListInJava {
    /* Normal Array Declaration
    int [] arr = new int[5]

   ArrayList Declaration
   ArrayList<Integer> list = new ArrayList<>();
 */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list + " -> " + list.size()); // list se content print hota hai aur list.size se
        // size print hota hai  // empty hai content aur size 0 hai // o/p [] -> 0

        // add
        list.add(10);  // content  aise add karte hai isme
        list.add(20);
        list.add(30);
        System.out.println(list + "->" + list.size());   // [10, 20, 30]->3

        // kahe per value inset karna ho to aise karege aur iske jagah ki value agle index per print hojayega
        list.add(1 , 1000); // bich me set karna ho to is add ka use karege
        System.out.println(list + "->" + list.size());  //  [10, 1000, 20, 30]->4

        int val = list.get(1); // get means value find karna  // not list[1] .. aise nahi likh sakte hai
        System.out.println(val);  // 1000

        list.set(1,2000);   // not list[1] = 20000; // set value change karta hai isme size nahi badhta hai..
        // add value insert karta hai aur isme size bhi bad jayega yehi diff hai set aur add me
        System.out.println(list + " -> " + list.size());  // [10, 2000, 20, 30] -> 4

        list.remove(1);
        System.out.println(list + " -> " + list.size());   // [10, 20, 30] -> 3

        // bahut se chigo ka ham ArrayList bana sakte hai
        ArrayList<String>l2 = new ArrayList<>();
        l2.add("Hello");
        l2.add("Bello");
        l2.add("Cello");
        System.out.println(l2 + " -> " + l2.size());   // [Hello, Bello, Cello] -> 3

//        for(int i =0; i<list.size(); i++){
//            int val1 = list.get(i);
//            System.out.println(val1);  // 10 20 30 println means niche ak dusare ke uper print honge
//        }
//        for(int val1: list){    // 10 below 20 below 30
//            System.out.println(val1);
//        }

        // Keval hamara intension sirf content print karane ka hai na ..To uske liye loop lagene ki need nahi
        // hoti uske liye simple Arraylist ko println kar denge to vo apne aap print kardega

        System.out.println(list);  // [10, 20, 30]
    }

}
