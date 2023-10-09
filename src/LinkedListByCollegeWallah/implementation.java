package LinkedListByCollegeWallah;

public class implementation {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {  // yaha se void display() tak data structure hai
        Node head = null;
        Node tail = null;
        int size = 0;

        void insertAtEnd(int val) {  // function  // data = val
            Node temp = new Node(val); // here we are understanding datatype of Node
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
            size++; // jab insert karege to size ko 1 se badhate rahege
        }

        void insertAtHead(int val) { // means we will give one value to whom do insert
            Node temp = new Node(val);
            if (head == null) {  // empty list
                head = tail = temp;
            } else { // non empty list // here we will connect  to head first
                temp.next = head;  // isko head bana dege
                head = temp; // aur head ko ham temp bana dege
            }
            size++;
        }

        void insertAt(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;  // is node ka bas work hoga age badhana // travelling karne  ke liye is node ko use karege
            if (idx == size) {
                insertAtEnd(val); // when idex aukat ke bahar ja raha hai to ye vala function chalayege
                return;  // means ye function end ho jaraha hai age ki chige chalegi hi nahi
            } else if (idx == 0) { //agar hamara idx 0 ke equal hai
                insertAtHead(val); // to insertAtHead value dal denge , insertAtHead make sure karege , ki
                // mera head ka jo data hai vo bhi  maintain rahe aur sahi se sari chige kam ho jaye
                return;
            } else if (idx < 0 || idx > size) { // koi galat sa i/p de raha hai like -1  ya agar index size se bada hua to
                System.out.println("wrong index");
                return;
            }
            for (int i = 1; i <= idx - 1; i++) {  // idx-1 it is important becasuse ise connection stablish se ak pahle tak lekar jana hai
                temp = temp.next; // temp ko aise age lekar jayege
            }
            t.next = temp.next; // temp ka jo next tha t ke next ko bhi vahi kar do ..idrectry dono ak hi value ko point kar rahe hai
            temp.next = t;
            size++; // where we will insert value then we will be increae by 1 of size
        }

        int getAt(int idx) {
            if (idx < 0 || idx > size) { // koi galat sa i/p de raha hai like -1  ya agar index size se bada hua to
                System.out.println("wrong index");
                return -1; // kyoki int hai iska return type
            }
            Node temp = head;
            for (int i = 1; i <= idx; i++) {
                temp = temp.next; // ise karne per ham us node per chale jayege jiski hame value chahiye
            }
            return temp.data; // yaha se value return kar jayega jo hame chahiye
        }
        void deletAt(int idx){ // loop Ak kam tak chalege aur jo delete karna hai uske chhod kar age vale
            // ko point karege  // hamko koi value idhar return nahi karna hai to ham void ka use karege
            if(idx==0) {
                head = head.next;
                size--; // kyoki delete karne ke bad index decrease ho jayegi
                return; // aur index agar 0 ko delete karna hai to starting value delete karke return hojayege kyo age badhane ki jarurat hi nahi hai
            }
            Node temp = head; // isi ko ham move karayege
            for (int i =1;i<=idx-1; i++){  // ak kam tak loop chalayege
                temp= temp.next; // isko point karaege delete ke age vale ko
            }
            temp.next = temp.next.next; // isper
            tail = temp; // ye jo last me value delete hui hai uske liye jo delete hu hai vo tail ko point
            // karta hai to usko khiska kar ak piche la denge
            size--; // becuse when we are deleting value the size is decreses by 1.
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        //        int size(){  // O(n) function    public int size(){}    static does not write in all function .when we creates function
//            Node temp = head;
//            int count = 0;
//            while (temp!= null){
//               count++;
//                temp= temp.next;
//            }
//            return count;
//        }
//    }
        public static void main(String[] args) {
            linkedlist ll = new linkedlist();
            // ll.insertAtHead(10);
            ll.insertAtEnd(4); // 4
            // ll.display();
            ll.insertAtEnd(5); // 4 -> 5
            //ll.display();
            // System.out.println(ll.size()); // 2
            ll.insertAtEnd(12);  // 4 -> 5 -> 12
            //ll.display();
            ll.insertAtHead(13);  //13-> 4 -> 5 -> 12
            ll.display();
//        ll.insertAt(2,10); //13-> 4 -> 10 -> 5 ->12
//        ll.display();
//        ll.insertAt(3,10); //13-> 4 -> 5 ->10 -> 12
//        ll.display();
            ll.insertAt(4, 10); //13-> 4 -> 5 ->10 -> 12 -> 10 // but is case me hamara tail pointer 10
            // per ayega "Nahi" ye 12 per hi rah jayega
           // ll.display();
//        System.out.println(ll.head.data); // 13
//        System.out.println(ll.tail.data); // 10 it is printing wrong
            ll.insertAt(0, 100); //100->13-> 4 -> 5 -> 12 ->10
           ll.display();
//        System.out.println(ll.getAt(3));  // 5
//        System.out.println(ll.getAt(0));  // 100
//        System.out.println(ll.getAt(-8));  // wrong index and -1 ayega
         //   System.out.println(ll.size); //size ka function yaha nahi likhege kyoki size ka function hamne
            // commentout kar diya hai aur ye attribute hai
           // ll.deletAt(4); //  100 13 4 5 10
//            ll.deletAt(5);  // 100 13 4 5 12
            ll.deletAt(0); //13 5 12 10
            ll.display(); // isse value print hogi
           // System.out.println(ll.tail.data); // 12
        }
    }
}
