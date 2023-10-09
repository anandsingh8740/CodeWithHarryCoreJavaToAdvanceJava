package ArrayListByShradhaKhapra;

import java.util.ArrayList;

public class P_12airSum_1ComplexityOn {

    // Time Complexity = O(n) best approach
    // 2 Pointer Appraoch
    public static boolean pairSum1(ArrayList<Integer>list, int target){
        int lp =0;
        int rp = list.size()-1;

        while (lp!=rp){
            // case 1
            if(list.get(lp) + list.get(rp)== target){
                return true;
            }
            // case 2
            if(list.get(lp) + list.get(rp) < target){
                lp++;
            }else {
                // case 3
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // 1, 2, 3, 4, 5, 6
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
       // int target = 50; // false
        int target = 5; // true
        System.out.println(pairSum1(list,target));
    }
}
