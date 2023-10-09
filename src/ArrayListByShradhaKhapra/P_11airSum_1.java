package ArrayListByShradhaKhapra;

import java.util.ArrayList;

public class P_11airSum_1 {
    /* Question
    Find if any pair in a Sorted ArrayList has a target sum
     list = [1,2,3,4,5,6], target=5
     */
    //Brute Force
    public static boolean pairSum1(ArrayList<Integer>list, int target){

        for(int i=0;i<list.size();i++){
            for(int j = i+1; j< list.size();j++){
                if(list.get(i) + list.get(j) ==target){
                    return true;
                }
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
        //int target = 5; //  output true
        int target = 50; //  output false
        System.out.println(pairSum1(list,target));

    }
}
