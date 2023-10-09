package ArrayList;

import java.util.ArrayList;
public class A_2rrayListsStacksAndQueues {
     public static void fun(int[][]arr){
        for(int i =0; i< arr.length;i++){
            for(int j =0; j <arr[i].length;j++){
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list + "and size is " + list.size());  // []and size is 0
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list + "and size is " + list.size());  // [10, 20, 30]and size is 3

        int val = list.get(1);
        list.set(1,200);
        System.out.println(val);  // 200
        System.out.println(list + "and size is " + list.size());  // [10, 200, 30]and size is 3

        list.add(1,4000);  // [10, 4000, 200, 30]and size is 4
        System.out.println(list + "and size is " + list.size());

        list.remove(1);
        System.out.println(list + "and size is " + list.size());  // [10, 200, 30]and size is 3

        System.out.println("-----------");
//        for(int val1 : list){
//            System.out.println(val1); // 10 200 30 below
//        }
        for(int i =0; i<list.size(); i++) {
            int val1 = list.get(i);
            System.out.println(val1);
        }

    }
}
