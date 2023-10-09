package StacksBySharddhaKhapara;

public class StackB_2 {

   static class Node{
     int data;
     Node next;
     Node(int data){
         this.data = data;
         this.next = null;
     }
   }
    static class Stack {
        static Node head = null;   // Linklist ka sabse important node hota hai head node

        public static boolean isEmpty() {
            return head == null; // linked list me hamari ak bhi node nahi hai ..yani khali hai linklist
        }

        // push
        public static void push(int data) {
            Node newNode = new Node(data);

            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // pop
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;  // return apne head ke data ko
        }
    }
        public static void main(String[] args) {
            StackB_1.Stack s = new StackB_1.Stack();
            s.push(1);
            s.push(2);
            s.push(3);

            while (!s.isEmpty()) {
                System.out.println(s.peek());
                s.pop();

            }
        }
    }
/*
3
2
1
 */

