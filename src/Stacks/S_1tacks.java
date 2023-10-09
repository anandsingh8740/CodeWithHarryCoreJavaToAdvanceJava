package Stacks;

import java.util.Stack;

public class S_1tacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        System.out.println(st);    // [10, 20]
        st.push(30);
        System.out.println(st);    // [10, 20, 30]
        st.push(40);
        System.out.println(st + "->" + st.peek() +" "+st.size());   //[10, 20, 30, 40]-> 40 4
        st.pop();
        System.out.println(st + "->" + st.peek() +" "+st.size());   // [10, 20, 30]->30 3
        st.pop();
        System.out.println(st + "->" + st.peek() +" "+st.size());   //[10, 20]->20 2
        st.pop();
        System.out.println(st + "->" + st.peek() + " " +st.size());   // [10]->10 1
        st.pop();
        System.out.println(st + "->" +  " " +st.size());  // []-> 0
    }
}
