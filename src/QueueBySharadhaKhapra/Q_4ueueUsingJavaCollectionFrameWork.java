package QueueBySharadhaKhapra;
import java.util.*;
// T.C = O(1)
public class Q_4ueueUsingJavaCollectionFrameWork {

    public static void main(String[] args) {
        // Queue q = new Queue();
        // implementation jab interviewer puchega tabhi batana hai
        // Always coding context aur kahi bhi isi dono ko niche valo ko use karna hai
       // Queue<Integer>q = new LinkedList<>(); // ArrayDeque
        Queue<Integer>q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();

        }
    }
}
