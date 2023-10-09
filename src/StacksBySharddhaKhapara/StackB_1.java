package StacksBySharddhaKhapara;

import java.util.ArrayList;
import java.util.Stack;

public class StackB_1 {
    static class Stack{
        static ArrayList<Integer>list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size() == 0;  // means hamare stack me ak bhi element nahi hai
        }
        // push    push function ko aise implement karege
        public static void push(int data){
            list.add(data);  // automatically top per add hojayega
        }
        // implement pop() function  // pop() fun delete karta hai apne data ko stack se
        public static int pop(){
            if(isEmpty()){  // ye represent karga ki hamara stack khali hai
                return -1;
            }
            int top = list.get(list.size()-1); // top ko nikala
            list.remove(list.size()-1);   // top ko remove kiya
            return top;  // top ko return kiya
        }
        // peek opration  // shirf top nikalana hai
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){   // jab tak hamara stak empty nahi hojata means isEmpty() hame true nahi dedeta tab tak ye loop chalega
            System.out.println(s.peek()); // element ko jhak lege ..print karava dege
            s.pop(); // phir delete karva dege ...tab tak karege jab tak hamara stack khali nahi jo jata hai

        }
    }
}
/*
3
2
1
 */