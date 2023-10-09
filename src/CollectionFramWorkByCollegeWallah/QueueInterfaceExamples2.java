package CollectionFramWorkByCollegeWallah;

import java.util.*;

public class QueueInterfaceExamples2 {

    static void DequeExamples(){
        Deque<Integer>dq = new ArrayDeque<>();
        dq.addLast(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq); // 2 1 3 4
        System.out.println(dq.pollFirst());   // 2
        System.out.println(dq.pollLast());  // 4 , aur 4 remove bhi ho jayega kyoki poll se remove hota
        // hai..peek() se shirf jhakate hai
        System.out.println(dq); // [1 3]
    }

    static void PriorityQueueExamples(){
        // PriorityQueue<Integer>pq =new PriorityQueue<>();  // "min PriorityQueue" ye chhote no. ke liye banta hai
    // means ye small number ko more Priority deti hai..jo jitna chhota hoga uski procession utna hi age hoga

        PriorityQueue<Integer>pq =new PriorityQueue<>(Comparator.reverseOrder()); // max PQ isse grater value pahle print hogi
        pq.add(10);
        pq.add(5);
        pq.add(7);
        System.out.println(pq.peek()); // 5 // 10(max p)- the smallest element has the highest priority queue
        System.out.println(pq); // [10, 5, 7](p max)Guarantee - topmost priority element will be provcesses..1st element ki guranty hogi ki ye sabse chhota hoga
        System.out.println(pq.poll());  // 5 //10
        System.out.println(pq);   // [7, 10] //[7, 5]
        System.out.println(pq.peek());  // 7
    }
    static void QueueExamples(){
        // LinkedList ke through ham queue banayege
        LinkedList<Integer>q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);   //
        System.out.println(q.peek()); // 1 print front
        System.out.println(q.poll()); // 1 -> will also remove
        System.out.println(q.peek()); //2
        System.out.println(q.isEmpty());  // false
        System.out.println(q.size()); //2
        System.out.println(q);  // [2, 3]

    }

    public static void main(String[] args) {
     // QueueExamples();
      PriorityQueueExamples();  // [5, 10, 7]
      DequeExamples();
    }
}
