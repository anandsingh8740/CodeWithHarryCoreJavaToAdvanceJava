package LinkedListBySharadhhaKhapara;

public class LinkedList {         // isclass ki jo object banegi vo ak puri LinkedList hogi
   public static class Node{
       int data;
       Node next;     // ye refrence variable hai apne next node ko point karne ke liye

       public Node(int data){   // initilized object karte hai constructor ki help se
           this.data = data;
           this.next = null;
       }
   }
   // LinkedList ke ander ak hi head aur ak hi tail hota hai
    //isko class ke ander as a property define kar sakte hai.. inko ham static bana dege
    public static Node head;
    public static Node tail;

    //yaha ham static nahi banaye hai isko ham indirctly call karege
    // static function ko ham main me directly call kar sakte hai non static ko nahi
    public void addFirst(int data){
       // step1 = create new node
        // className(Node) objectname(newNode) = newKeyword className(Node) (class ke ander hai
        // constructor.. me pass kar dege data (data)
       Node newNode = new Node(data);

       // when linkedlist is empty
       if(head==null){
           head= tail = newNode;
           return;
       }

       // step2 - newNode next = head
        newNode.next = head; // link ....yaha ham link kiye hai ak node ko dusare node se

        // step3 - head = newNode
        head = newNode;
    }
    // addLast ke liye ham code likhate hai
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    // print karne ke liye method
    public void print(){  // O(n)
        if(head == null){ // base case
            System.out.println("LL is empty");
            return;
        }
        //z
        Node temp = head;
        while(temp!= null){ // iscode se ham linked list ko print kar sakte hai
            System.out.print(temp.data +"-> "); // yaha ham temp ka data print karege
            temp = temp.next; // yaha ham temp ko update karte hai
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        // create LinkedList
        // same LinkedList class ki ham object banayege
        LinkedList ll = new LinkedList(); // isi object ke ander ham sare node create kar sakte hai
        ll.print();;
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
    }
}
/*
LL is empty
2-> null
1-> 2-> null
1-> 2-> 3-> null
1-> 2-> 3-> 4-> null
 */