package LinkedListBySharadhhaKhapara;
// Add in the middle
public class LinkedList_2_AddInMiddle {

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
    public void print(){    // O(n)
        Node temp = head;
           while (temp!= null){
               System.out.print(temp.data+"->");
               temp = temp.next;
           }
        System.out.print("null");
        }

    // yaha se start hai add middle
    public void add(int idx , int data){
        // add karna hai to ham sabse pahle apne new Node ko create karege
        if(idx ==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i=0; // ye track karge ki abhi mera temp koin se index per hai
        while (i< idx-1) {   // meanse hamara temp previous node ko point kar raha hai
            temp = temp.next;
            i++;
        }
        // i = idx-1; temp =prev ke equal ho jayega
        newNode.next = temp.next;
        temp.next= newNode;
    }
    public static void main(String[] args) {
        // sabse uper jo class name hoga usko hi yaha per mention karege
        LinkedList_2_AddInMiddle ll = new LinkedList_2_AddInMiddle(); // isi object ke ander ham sare node create kar sakte hai
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2,9);  // index 2 ke uper apni node 9 ko
        ll.print();
    }
}

// 1->2->9->3->4->null