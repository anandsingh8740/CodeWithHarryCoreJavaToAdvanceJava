package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class D_2uplicateBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')') {
                if (st.peek() == '(') {    // ( ye bach jaye katane per
                    System.out.println(true);
                    return;
                }else{
                    while(st.peek()!= '('){
                        st.pop();
                    }
                st.pop();
            }
        }else{
            st.push(ch);
        }
    }
        System.out.println(false);
    }
}

/*
((a+b) + (c+d))
false

(a+b) + ((c+d))
true
 */