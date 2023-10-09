package CollectionFramWorkByCollegeWallah;

import java.util.LinkedHashSet;
// isme jis order me value insert karege usi order me value print hoga
public class LinkedHashSet4 {
    public static void main(String[] args) {
        LinkedHashSet<Integer>st = new LinkedHashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(48);
        st.add(15);
        st.add(10);
        System.out.println(st); // [1, 2, 3, 48, 15, 10]
    }
}
