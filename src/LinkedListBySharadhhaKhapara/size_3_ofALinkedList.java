package LinkedListBySharadhhaKhapara;
import java.util.*;
public class size_3_ofALinkedList {
    public static class Node{
        int data;
        Node next;     // ye refrence variable hai apne next node ko point karne ke liye

        public Node(int data){   // initilized object karte hai constructor ki help se
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    // yaha se ye start hoga ye vala question
    public static int size; // iski value bydefault java initilize kar dega 0
    public void addFirst(int data){
        // step1 = create new node
        Node newNode = new Node(data);
        size++;
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
    public void addLast(int data){
      Node newNode = new Node(data);
      size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void print(){    // O(n)
        Node temp = head;
        while (temp!= null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void add(int idx , int data){
        // add karna hai to ham sabse pahle apne new Node ko create karege
        if(idx ==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
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
    // REMOVE FIRST LINKEDLIST CODE PRESENT HERE

    public int removeFirst(){ // jisko bhi node ko ham delete  karne vale hai uski value ko return karne vale hai
        if(size==0){ // means empty hai linkedlist
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size==1) { // head bhi same hai tail bhi = null
            int val = head.data;
            head= tail = null;
            size =0;
            return val;
        }
        int val = head.data; // hame jisse delete karna hai vo head ka data hai
          head = head.next;
          size--;
          return val;
    }

    // REMOVELAST KI VALUE
    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
        // prev : i = size-2
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }

        int val = prev.next.data;  //prev ke next ka data   // tail.data
        prev.next = null;
        tail=prev;
        size--;
        return val;
    }

    public static void main(String[] args) {
        size_3_ofALinkedList ll = new size_3_ofALinkedList(); // isi object ke ander ham sare node create kar sakte hai
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2,3);  // index 2 ke uper apni node 9 ko

        ll.print();    // 1->2->3->4->5->null

       // System.out.println(ll.size);   //5
        ll.removeFirst();
        ll.print();

        ll.removeLast();
        ll.print();
        System.out.println(ll.size);
    }
}
/*
1->2->3->4->5->null
5

1->2->3->4->5->null
2->3->4->5->null
2->3->4->null
3

 */