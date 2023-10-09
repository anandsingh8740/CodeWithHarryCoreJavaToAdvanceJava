package LinkedListInterviewQuestionCollegeWallaha;

public class nthNodeFromEnd {
    public static Node nthNode(Node head , int n){  // we can assume return type of Node // int n isse ham last se value nikalege
       int size  =0;
       Node temp = head;
       while (temp!= null){  // size ko aise ham get kar sakte hai ..ye temp travel ke through
           size++;  // aise ham size nikal lege
           temp=temp.next;
       }
       // nth node from last
        int m = size - n + 1;   // nth from last = (m - n +1)th node from Start
        // mth node from start
        // like 4th value from start nikalna hai to hai loop "ak kam bar" lagayege kyoki 4th means Node 4..temp se start hoga loop lagana
        temp = head; // kyoki uper hamara temp ak bar head tak chala gaya tha to phir se ham temp ko head tak layega
        for(int i =1;i<=m-1;i++){
            temp = temp.next;  // ab ye hamara desired node tak pahuch jayega
        }
        return temp;
    }
    // ye method important hai
    public static Node nthNode2(Node head, int n){
        Node slow = head;
        Node fast = head;
        for(int i =1; i<=n; i++){  // jaha n diya hai vahi tak jayege.. isme shirf fast ko age badha denge
            fast = fast.next;
        }
        while (fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;   // last me slow hamara bilkul sahi jagah mil jayega ... to suko as it is return kar denge
    }
    // Removing Nth Node from the end of LinkedList
    public static Node deleteNthFromEnd(Node head, int n){
        Node slow = head;
        Node fast = head;
        for(int i =1; i<=n; i++){
            fast = fast.next;
        }
        if(fast == null){
            head = head.next;  // now we will delete head and store next head ih head
            return head;
        }
        while (fast.next!=null){  // yaha uper vale se thoda sa condition me change karege
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;   // yaha se jo delete karna hai uske agala vala store hojayega
        return head;
    }
    public static void display(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static  class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        // ye hamne manually khud se linked list bana di
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);
        // create connection
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next =f;
        // 100 13 4 5 12 10
     //  Node q = nthNode(a,3);   // 3rd se last 5
//        Node q = nthNode(a,2);  // 12
//        Node q = nthNode2(a,2);  // 12
//        Node q = nthNode2(a,4);  // 4
//        System.out.println(q.data);  // 5

        display(a);
//        deleteNthFromEnd(a,2);   // 100 13 4 5 10  ...last 2nd ko delete kiye hai
       a= deleteNthFromEnd(a,6);  // 13 4 5 12 10
        display(a);
    }
}
