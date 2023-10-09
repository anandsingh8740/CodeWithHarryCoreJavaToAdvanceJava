package LinkedListByCollegeWallah;

public class reverseList {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    public static Node reverse(Node head){
        if(head.next== null) return head;
        Node newHead = reverse(head.next);
        head.next.next = head; // interchanging the connections................ 1 2 3 4 (work) 2 ka next 1 ban jayega head.next.next
        head.next = null;
        return newHead;
    }
    public static void displayrev(Node head){
        if(head==null) return; // base case
        displayrev(head.next);  // call
        System.out.print(head.val+" "); // work
    }
    public static void display(Node head){
        if(head==null) { // base case
//        System.out.print(head.val+" ");  // 3 5 1 2 4
            // display(head.next);  // call
            System.out.println();  // isse gap dur ho jayega
            return;
        }
        System.out.print(head.val+" "); // work
        display(head.next);  // call

    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(1);
        Node d = new Node(2);
        Node e = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
         display(a);
        a = reverse(a); // ye ak aisa function hai jo ki ak as a argument leta hai node ko .
        // .Aur return bhi node ko karta hai  .. isilye hamne node ke ander ise store kara diya
        display(a);
    }
}
