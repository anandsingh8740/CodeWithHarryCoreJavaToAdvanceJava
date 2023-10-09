package LinkedListByCollegeWallah;

public class basicsll {
    public static void insertAtEnd(Node head, int val){
        Node temp = new Node(val);
        Node t = head; // kisi bhi chige ka next null hojata hai to vo tail ho jata hai
        while (t.next!=null){ // ye tail tak pahuchane ki condition hai
            t= t.next;
        }
        t.next = temp;

    }
    //using recursion
    public static void displayr(Node head) {
        if (head == null) return;  // Normal display code
        System.out.print(head.data +" ");  // 5 3 9 8 100
        displayr(head.next);
       // System.out.print(head.data +" ");  // 100 8 9 3 5
    }
    public static void displayreverse(Node head) {  // it will print reverse order.
        if (head == null) return;  // Normal display code
        displayreverse(head.next);
        System.out.print(head.data +" ");  // 100 8 9 3 5
    }
    // Create a function for printing data.
    public static void display(Node head){  // it is receiving a Node head
        while (head != null){
            System.out.print(head.data+ " ");
            head = head.next;
        }
    }
    // evaluate length , Length Method
    public static int length(Node head){
        int count = 0;
        while (head != null) {
           count++;
            head = head.next;
        }
        return count;
    }
    public static class Node{
        int data;  // value
        Node next;   // address of next node
        Node(int data){    // constructor
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);  // head (isko use karke ham sabko access kar sakta hu)
        //   System.out.println(a.next); // null
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
       // Node f = new Node(23);
        // 5  3  9  8 16
        a.next = b; // 5 -> 3 9 8 16
        // System.out.println(a.data); // a.next.data =3 and a.next =5; ayega sout karne per
        // if we have to conn  ect Among themselves all linkedlist.
        b.next = c;  // 5 -> 3 -> 9 8 16
        c.next = d;  //  5 -> 3 -> 9 -> 8 16
        d.next = e;  // //  5 -> 3 -> 9 -> 8 -> 16
        //e.next = f;
//        System.out.println(a.data);
//        System.out.println(a.next.data);
//        System.out.println(a.next.next.data); // c.data= c.next.next.data
//        System.out.println(a.next.next.next.data);
//        System.out.println(a.next.next.next.next.data);

//        Node temp = a;
//        while (temp!=null){  // This is code for displaying...or Printing the list
//            System.out.print(temp.data +" ");
//            temp = temp.next;  // it will print next own member  //Imp
//        }

//        display(a);
//        System.out.println();
//        display(a);
//        display(a);
//        System.out.println();
//        displayr(a);
//        System.out.println(length(a));
        insertAtEnd(a,87); // a is Node , we have to insert 87
        display(a); // 5 3 9 8 16 87


    }
  }



