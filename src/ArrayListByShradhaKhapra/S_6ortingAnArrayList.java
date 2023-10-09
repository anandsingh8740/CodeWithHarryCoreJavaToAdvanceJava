package ArrayListByShradhaKhapra;
//import java.util.ArrayList;
//import java.util.Collections;
import java.util.*;  // * means all
public class S_6ortingAnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println(list);
        Collections.sort(list);   //ascending
        System.out.println(list);

        // descending
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}

/*
[2, 5, 9, 3, 6]
[2, 3, 5, 6, 9] ass
[9, 6, 5, 3, 2] des
 */