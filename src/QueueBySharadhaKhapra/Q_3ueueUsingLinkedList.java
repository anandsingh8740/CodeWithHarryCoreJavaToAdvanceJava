package QueueBySharadhaKhapra;

public class Q_3ueueUsingLinkedList {
        static class Node {
            int data;
            Node next;

            Node(int data) {   // constructor  // ye hai node ki initilization
                this.data = data;
                this.next = null;
            }
        }
    static  class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){  // circular ko full hone ki condition

        return head== null & tail == null;
        }

        // add
        public static void add(int data){
          Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        // remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int front = head.data;
            // single element
            if(tail == head){
                tail=head = null;
            }else{
                head = head.next;
            }
            return front;
    }
        // peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()){ // jab tak hamri queue khali nahi hojati tabtak ham apne element ko peek karna chahte hai
            System.out.println(q.peek()); // ak bar peek kar liya iske bad ham remove kar dege
            q.remove();

        }
    }
}

/*
1
2
3

 */