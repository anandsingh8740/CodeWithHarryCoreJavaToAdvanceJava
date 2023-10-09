package QueueBySharadhaKhapra;
 //O(n) T.C ke liya hai ye code
public class A_2rrayUsingCircularQueue {

    static class Queue{
        static   int arr[];
        static int size;
        static int rear;
        static int front;
        // Queue ka ab ham constructor bana lege
        Queue(int n){   // n is a Array size
            arr = new int[n];
            size =n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }
        public static boolean isFull(){  // circular ko full hone ki condition
           return (rear+1)% size == front;
    }
        // add
        public static void add(int data){
            // check hamri data kya full hogayi
            if(isFull()) {
                System.out.println("queue is full");
                return;
            }
            // add first element
            if(front == -1){ // ye jab front -1 hoga tab use karege ye condition
                front =0;
            }
            // rear ko update kar denge
            rear = (rear +1) % size;
            arr[rear] = data;
        }
        // remove
        public static int remove(){
            // int isliye use karege kyoki us remove karke us element ko ham return karna chahte hai
            // is function ko value ko
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;  // negative no. ye simulize karta hai ki ..yaha per koi element store nahi hai
            }

            int result = arr[front];
            front = (front +1)%size;
            // last element delete
            if(rear == front){
                rear = front =-1;
            }else{ // aisa nahi hai to baki casees me
                front = (front +1) %size;
            }
            return result;
        }

        // peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[front];
        }
    }

        public static void main(String[] args) {
            A_1rrayUsingQueue.Queue q = new A_1rrayUsingQueue.Queue(3);
            q.add(1);
            q.add(2);
            q.add(3);
            System.out.println(q.remove());
            q.add(4);
            System.out.println(q.remove());
            q.add(5);
            while (!q.isEmpty()){ // jab tak hamri queue khali nahi hojati tabtak ham apne element ko peek karna chahte hai
                System.out.println(q.peek()); // ak bar peek kar liya iske bad ham remove kar dege
                q.remove();

            }
        }
    }

    /*
    // output
1
2
3
4
5
     */

