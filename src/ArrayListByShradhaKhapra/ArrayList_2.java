package ArrayListByShradhaKhapra;

import java.util.ArrayList;

public class ArrayList_2 {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.size()); //5

        // print the arraylist
        for(int i =0; i< list.size(); i++){
            System.out.print(list.get(i) +" "); // 1 2 3 4 5
        }
        System.out.println();
    }
}
