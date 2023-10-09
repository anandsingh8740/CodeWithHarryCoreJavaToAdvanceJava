package ArrayList;
import java.util.*;

public class Q_4ueuesInJava {

    public static void fun(int[][]arr){
        for(int i =0; i< arr.length;i++){
            for(int j =0; j <arr[i].length;j++){
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ArrayDeque<Integer> que = new ArrayDeque<>();
        que.addLast(10);
        que.addLast(20);
        que.addLast(30);
        System.out.println(que);   // [10, 20, 30]
        que.addLast(40);
        System.out.println(que);  // [10, 20, 30, 40]

        System.out.println(que.getFirst());  // 10
        System.out.println(que);   //  [10, 20, 30, 40]

        System.out.println(que.removeFirst());  // 10
        System.out.println(que);                // [20, 30, 40]
    }
}
