package QueueBySharadhaKhapra;
import java.util.*;
public class Q_5ueueUsing_2_Stacks {

    static class Queue{
        static Stack<Integer>s1= new Stack<>();
        static Stack<Integer>s2= new Stack<>();

        // basic function sabse pahle implement karege isEmpty() vala
        public static boolean isEmpty(){
            return s1.isEmpty(); // s1 khali hai yani hamari puri queue khali hai
        }
        // s2 ke ander kyoki permanantly element ko store hi nahi kar rahe to s2 ko dekhane ki jarurat nahihai yaha

        // add  O(n)
        public static void add(int data){
            // add karne ka pahle step ye hai ki s1 jabtak khali nahi hota tab tak s1 ke sare element ko s2
            // me patak ya rakh dena
            while (!s1.isEmpty()){
                s2.push(s1.pop()); //s1 jabtak khali nahi hota tab tak s1 ke element ko pop() karaye aur s2 me
                //push kar de // ye hai 1st step
            }
            // 2nd step  s1 me push kar do apne data ko
            s1.push(data);
            //3rd step ..vapash se s2 se utha kar element ko s1 me dal dena
            while (!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        // remove
        public static int remove(){
            if(isEmpty()){   // sabse pahle check karege ki  empty to nahi hai
                System.out.println("queue empty"); // empty hai to ye print karayege
                return -1;
            }
            // nahi to hame ye return karna hai
            return s1.pop();  // pop() isliye kyoki ab to hamara jo element front per aya tha yani sabse pahle
            // aya tha ..vo to s1 ke top per hai usi ko pop kara dege to hamra front return bhi hojayega
            // aur sath ke sath nikal bhi jayega
        }

        // peek ko ab implement karege
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue empty");
                return -1;
            }
            // nahi to hame ye return karna hai
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
/*
1
2
3
 */