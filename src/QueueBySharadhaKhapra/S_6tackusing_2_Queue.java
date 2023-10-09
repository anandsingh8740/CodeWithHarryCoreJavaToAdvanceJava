package QueueBySharadhaKhapra;
import java.util.*;
public class S_6tackusing_2_Queue {
        static class Stack {
            static Queue<Integer> q1 = new LinkedList<>();
            static Queue<Integer> q2 = new LinkedList<>();

            public static boolean isEmpty() {
                return q1.isEmpty() && q2.isEmpty();
            }

            // add function yaha hame stack ke ander data push karna hoga
            public static void push(int data) {
                // data ko push karne ka process ye rahege jo bhi queue non empty hai usi me ham add kardege

                if (!q1.isEmpty()) {
                    q1.add(data);
                } else {
                    q2.add(data);
                }
            }

            //implement pop function
            public static int pop() {
                if (isEmpty()) {
                    System.out.println("empty stack");
                    return -1;
                }
                int top = -1;
                // pop karne ka process ham jab tak q1 element  bahar nikalte jayege jabtak ham last element
                // tak nahi pahuch jate ..ussare element ko ham q2 me dal rahe honge

                // case 1
                if (!q1.isEmpty()) {
                    while (!q1.isEmpty()) {
                        top = q1.remove();
                        if (q1.isEmpty()) {
                            break;
                        }
                        q2.add(top);
                    }
                } else { // case 2
                    while (!q2.isEmpty()) {
                        top = q2.remove();
                        if (q2.isEmpty()) {
                            break;
                        }
                        q1.add(top);
                    }
                }
                return top;
            }

            public static int peek() {
                if (isEmpty()) {
                    System.out.println("empty stack");
                    return -1;
                }
                int top = -1;
                // case 1
                if (!q1.isEmpty()) {
                    while (!q1.isEmpty()) {
                        top = q1.remove();
                        q2.add(top);
                    }
                } else { // case 2
                    while (!q2.isEmpty()) {
                        top = q2.remove();
                        q1.add(top);
                    }
                }
                return top;
            }
        }
    public static void main(String[] args) {
          Stack s = new Stack();
          s.push(1);
          s.push(2);
          s.push(3);

          while (!s.isEmpty()){
              System.out.println(s.peek());
              s.pop();
        }
    }
}

/*
3
2
1
 */