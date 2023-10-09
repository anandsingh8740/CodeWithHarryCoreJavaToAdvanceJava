package StacksBySharddhaKhapara;

import java.util.*;
public class StackB_3 {
    public static void main(String[] args) {
      // Stack s = new Stack();
        Stack<Integer> s = new Stack<>();  // sabse easy implementaion hai stack ki
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
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