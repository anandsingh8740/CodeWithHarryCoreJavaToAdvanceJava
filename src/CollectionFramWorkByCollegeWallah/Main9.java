package CollectionFramWorkByCollegeWallah;
import java.util.*;
public class Main9 {
    /* Question:-
    Create a HashMap using Java HashMap class to store the following pairs(Person, Age) and display then
    // persion is a key and age is a value//
        input:
        Akash 21
        Yash 16
        Lav 17
        Rishika 19
        Harry 18

        Output:
        Age of Akash is 21
        Age of Yash is 16
        Age of Lav is 17
        Age of Rishika is 19
        Age of Harry is 18

     */
    static  void HashMapMethods(){
        // Syntax
        Map<String, Integer>mp = new HashMap<>();
        // Adding Elements
        mp.put("Akash", 21);
        mp.put("Yash", 16);
        mp.put("Lav", 17);
        mp.put("Rishika", 19);
        mp.put("Harry", 18);

        // Getting value of a key from the HashMap
        System.out.println(mp.get("Yash"));  // 16
        System.out.println(mp.get("Rahul")); //null

        //Changing value of a key in the HashMap
        mp.put("Akash", 25);   // Akash - 25 update value 
        System.out.println(mp.get("Akash"));  // 25;

        //Removing a pair from the HashMap
        System.out.println(mp.remove("Akash"));  //25
        System.out.println(mp.remove("riya"));   // null

        // checking if a key is the HashMap
        System.out.println(mp.containsKey("Akash")); // false  // containsKey ye check karta hai ki key present hai ki nahi
        System.out.println(mp.containsKey("Yash")); //true ... because Yash exists.

        // Adding a new entry only if the new key doesn't exist already
        mp.putIfAbsent("Yashika", 30);  // will enter
        mp.putIfAbsent("Yash", 30);   // will not enter
        // Get all keys in the Hashmap
        System.out.println(mp.keySet());
        // Get all values in the Hashmap
        System.out.println(mp.values());
        // Get all entries in the Hashmap
        System.out.println(mp.entrySet());
        // Traversing all entries of Hashmap - multiple methods
        for(String key : mp.keySet()){
            System.out.printf("Age of %s is %d\n", key, mp.get(key));
        }
        System.out.println();
        for(Map.Entry<String, Integer> e:  mp.entrySet()){
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }
        System.out.println();
        // bast way printing above two
        for(var e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }
    }

    public static void main(String[] args) {
        HashMapMethods();
    }
}
