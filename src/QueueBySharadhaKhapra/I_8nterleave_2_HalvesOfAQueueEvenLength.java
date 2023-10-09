package QueueBySharadhaKhapra;
import java.util.*;
public class I_8nterleave_2_HalvesOfAQueueEvenLength {
    public static void interLeave(Queue<Integer>q){
        // interleave karne ke liye hame sabse pahle  ak new queue banani padegi for storing my first half
        Queue<Integer>firstHalf = new LinkedList<>();
        int size = q.size();

        for(int i =0; i<size/2; i++){
            firstHalf.add(q.remove());         // q se jo bhi element remove hai vo first half me add kardenge
        }
        while (!firstHalf.isEmpty()){
            q.add(firstHalf.remove());
            q.add(q.remove());  // q se hame element remove karna hai aur queue ke ander se hi hame us element ko add karna hai

        }
    }


    public static void main(String[] args) {
        Queue<Integer>q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interLeave(q);
        // print Q
        while (!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }
}
// 1 6 2 7 3 8 4 9 5 10