package QueueBySharadhaKhapra;

public class A_1rrayUsingQueue {

    // Queue ko implement karne ke liye ak static class babayege... iske ander define karege Array
    static class Queue{
      static   int arr[];
        static int size;
        static int rear;
        // Queue ka ab ham constructor bana lege
        Queue(int n){   // n is a Array size
           arr = new int[n];
           size =n;
           rear = -1;
        }
        public static boolean isEmpty(){
            return rear == -1;    // rear ki value -1 hai jaise hi hamne initlize kiya tha mtlb hamari queue
            //me ak bhi element store nahi hai aur queue hamari empty hai
        }
        // add
        public static void add(int data){
        // check hamri data kya full hogayi
        if(rear== size-1) {
            System.out.println("queue is full");
        }
        // actually use add kar dena
            rear = rear +1;
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
            // ab ham front ko return karege
            int front = arr[0];
            // return karne se pahle ham is value ko delete karna hai
            // delete karne ka tarika sare ke sare element ko ak ak piche shift kar de
            // yani jo ab 1st idx per tha ab vo 0th index per aajaye ..jo second per tha vo 1st per aajaye
            // front hamesha hamara 0th index per hoga lekin age age element shift hojayege
            for(int i=0; i<rear;i++){
                arr[i] = arr[i+1];
            }
            rear = rear - 1;
            return front; // isi fun ko ham array se return kar dege
        }

        // peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        // stack 3 2 1 ...// queue 1 2 3
        while (!q.isEmpty()){ // jab tak hamri queue khali nahi hojati tabtak ham apne element ko peek karna chahte hai
            System.out.println(q.peek()); // ak bar peek kar liya iske bad ham remove kar dege
            q.remove();

        }
    }
}

/*
o/p: jis order me ander gaye the usi order me bahar ayege // stack hota ho order apposite ho jata
1
2
3
 */