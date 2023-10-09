package CollectionFramWorkByCollegeWallah;

import java.util.TreeSet;
// isme ham kisi bhi order me value dalege to ye hame sorted order me milegi output me value
public class TreeSetExample5 {
    public static void main(String[] args) {
        TreeSet<Integer>st = new TreeSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(48);
        st.add(15);
        st.add(10);
        System.out.println(st);  // [1, 2, 3, 10, 15, 48]
    }
}
