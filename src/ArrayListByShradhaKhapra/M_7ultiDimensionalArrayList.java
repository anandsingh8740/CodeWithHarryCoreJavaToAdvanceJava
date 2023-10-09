package ArrayListByShradhaKhapra;

import java.util.ArrayList;

public class M_7ultiDimensionalArrayList {
    public static void main(String[] args) {
        // 2D ArrayList ko aise define karte hai
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>(); // main list bani

        // Agar hame koi List store karna hai to ham use List ko "Pahle create karege"
        ArrayList<Integer>list = new ArrayList<>(); // mainList define hohayi iske ander
        list.add(1);    // yaha value store hai
        list.add(2);
        mainList.add(list);

        ArrayList<Integer>list2 = new ArrayList<>();  // new list hamne banaya
        list2.add(3); list2.add(4);
        mainList.add(list2);

        for(int i=0; i<mainList.size();i++){  // mainList
            ArrayList<Integer>currList = mainList.get(i); // mainList se abham currList Nikalana chahate hai
            // sabse pahle pahli list ayegi usko print karayege uske bad
            // list2 ayegi to usko print karayege ko print karayege
            for(int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j)+ " ");
            }
            System.out.println();
        }
        System.out.println(mainList);
    }
}

/*
1 2
3 4
[[1, 2], [3, 4]]   mainList

 */