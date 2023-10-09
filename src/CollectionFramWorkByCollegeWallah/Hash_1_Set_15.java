package CollectionFramWorkByCollegeWallah;

import java.util.*;
// Hashset duplicate value ko print nahi karata hai
public class Hash_1_Set_15 {
    public static void main(String[] args) {
        HashSet<String> st = new HashSet<>();
        st.add("James");   // yaha ham aise value insert karege    hashmap me ham put karke value ko add karte the
        st.add("Scott");
        st.add("James");
        System.out.println(st); //  James, Scott
        System.out.println(st.contains("James"));  // true ...return boolean
        System.out.println(st.size());   //2
        st.remove("James");
        System.out.println(st.contains("James"));  // false ...return boolean
        System.out.println(st.size());   //1
        System.out.println("Mark");
        for(String s : st){
            System.out.println(s); // Mark, Scott
        }
    }
}
