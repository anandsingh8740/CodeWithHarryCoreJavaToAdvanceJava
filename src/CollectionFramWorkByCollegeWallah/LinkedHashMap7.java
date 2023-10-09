package CollectionFramWorkByCollegeWallah;
import java.util.*;
// isme ham jis order me insert karege usi order me values ko print karayega
public class LinkedHashMap7 {
    public static void main(String[] args) {
        Map<Integer, String>mp = new LinkedHashMap<>();
        mp.put(3, "Aman");
        mp.put(1, "Rohan");
        mp.put(2, "Riya");
       System.out.println(mp);  // {3=Aman, 1=Rohan, 2=Riya}
    }
}
