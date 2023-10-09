package QueueBySharadhaKhapra;
import java.util.*;
public class S_11tackAndQueueUsingDeque {
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
    public static void main(String[] args) {
        Stack s = new Stack(); // ye java collection framwork vala stack nahi hai  ye jo uper stack class vala stack hai
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("peek = "+ s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
