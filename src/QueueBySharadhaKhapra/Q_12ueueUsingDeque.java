package QueueBySharadhaKhapra;
import java.util.*;
public class Q_12ueueUsingDeque {
    static class Stack{
        // ye stack class  implement ho rahi hai deque ki help se
        Deque<Integer>deque = new LinkedList<>();

        public void push(int data){
            deque.addLast(data);
        }
        public int pop(){
            return deque.removeLast();
        }
        public int peek(){
            return deque.getLast();
        }
    }
    static class Queue{
        Deque<Integer>deque = new LinkedList<>();
        public void add(int data){
            deque.addLast(data);
        }
        public int remove(){
            return deque.removeFirst();
        }
        public int peek(){
            return deque.getFirst();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(); // ye java collaction vali queue nahi hai ye uper
        // static class ke ander jo banaye hai uska queue hai
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("peek =" +q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
/*
peek =1
1
2
3
 */