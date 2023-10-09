package QueueBySharadhaKhapra;
import java.util.*;
public class D_10eque {
    public static void main(String[] args) {
        // Deque already ak interface hota hai java ke ander
        Deque<Integer>deque = new LinkedList<>();
        deque.addFirst(1);   // 1
        deque.addFirst(2);   // 2 1
        deque.addLast(3);   //  2 1 3
        deque.addLast(4);   // 2 1 3 4
        System.out.println(deque); // [2, 1, 3, 4]

        // yaha per ham removel last se kar sakte hai
         deque.removeLast();
         System.out.println(deque);  // [2, 1, 3]

        System.out.println("first el = " + deque.getFirst());
        System.out.println("last el = " + deque.getLast());


    }
}
/*
       [2, 1, 3, 4]
        [2, 1, 3]
        first el = 2
        last el = 3
*/