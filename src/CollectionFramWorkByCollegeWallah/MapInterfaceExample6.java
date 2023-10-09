package CollectionFramWorkByCollegeWallah;
import java.util.*;
// ye inorder me print karayega
public class MapInterfaceExample6 {
    public static void main(String[] args) {
        Map<Integer, String> mp = new HashMap<>();
        mp.put(3, "Aman");
        mp.put(1, "Rohan");
        mp.put(2, "Riya");
//        System.out.println(mp);  // {1=Rohan, 2=Riya, 3=Aman}
//
//        System.out.println(mp.get(2)); // Riya // kisi value ko retrive karni ho to get() ka use karte hai
//        System.out.println(mp.containsKey(4)); //false // means ki kya ye key exist karti hai
//        System.out.println(mp.containsValue("Riya")); // true

        //  mp.put(1, "Priya"); // {1=Priya, 2=Riya, 3=Aman} over-rides  // means old value ko remove karke ye new vala add hojayega
        // which means if you do something like this the pass
        // values the older values the over-riden the new value
        mp.putIfAbsent(1, "Priya");  // to ab value change nahi hogi older vali kya hua same key per alag value hamne insert kiya hai
        System.out.println(mp); // {1=Rohan, 2=Riya, 3=Aman}  // Not show Priya
        System.out.println(mp.entrySet());  // [1=Rohan, 2=Riya, 3=Aman]
        System.out.println(mp.keySet()); //[1, 2, 3]     isse key mil jayegi
        System.out.println(mp.values());  // [Rohan, Riya, Aman]    isse values mil jayegi


        // Iterating over keys in a map
        for (Integer i : mp.keySet()) {  //  for(var s :mp.keySet())
            System.out.println(i);
            // Output
//            1
//            2
//            3
        }

        // Iterating over values in a map
        for (var s : mp.values()) {  // var likhane se ye samjh jayega ki kya ham print karvana hai variable ko samjh jayega
            System.out.println(s);
            // Output
//                        Rohan
//                        Riya
//                        Aman

            // Iterate over the key, value mapping
            for (var e : mp.entrySet()) {
                System.out.println(e);
//                    1=Rohan
//                    2=Riya
//                    3=Aman
            }
            for (var f : mp.entrySet()) {
                System.out.println(f.getKey());
//                1
//                2
//                3
            }
            for (var g : mp.entrySet()) {
                System.out.println(g.getValue());
//                        Rohan
//                        Riya
//                        Aman
            }
        }
    }
}