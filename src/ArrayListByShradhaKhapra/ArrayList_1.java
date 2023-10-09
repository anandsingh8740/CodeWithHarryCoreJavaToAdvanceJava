package ArrayListByShradhaKhapra;
import java.util.ArrayList;
public class ArrayList_1 {
    public static void main(String[] args) {
     // String | Boolean  | Float
        // ClassName objectName = new ClassName();
        ArrayList<Integer>list = new ArrayList<>(); // yaha per list name ka arrayList hai, list ke ander ham Integer ko store kara sakte hai
        ArrayList<String>list2 = new ArrayList<>();
        ArrayList<String>list3 = new ArrayList<>();

        list.add(1);  // yaha list object hai ...aur add() function hai
        list.add(2); // O(1)
        list.add(3);
        list.add(4);
        list.add(5);


        list.add(1,9); //O(n)  index 1 per ham 9 ko add kar rahe hai //[1, 9, 2, 3, 4, 5]
        System.out.println(list); // [1, 2, 3, 4,5]

        // Get Operation O(1)
//        int element =  list.get(2); // get(index pass karte hai yaha per);
//        System.out.println(element);  // 3 output

        // Delete
//        list.remove(2);
//        System.out.println(list);  // [1, 2, 4, 5]  yaha 3 remove hogaya

//        list.set(2, 10);
//        System.out.println(list);  // [1, 2, 10, 4, 5]

        // contains -- kya value ArrayList ke ander Exist hai ki nahi ye check karta hai conatain
//        System.out.println(list.contains(1)); // true
//        System.out.println(list.contains(11)); // false
    }
}
