package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class B_3alancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')') {
                boolean val = handleClosing(st, '(');  // ( corresponding opening character
                if (val == false) {
                    System.out.println(val);
                    return;
                }
            } else if (ch == '}') {
                boolean val = handleClosing(st, '{');  //  { corresponding opening character
                if (val == false) {
                    System.out.println(val);
                    return;
                }
            } else if (ch == ']') {
                boolean val = handleClosing(st, '['); // [ corresponding opening character
                if (val == false) {
                    System.out.println(val);
                    return;
                }
            } else {

            }
        }
        if (st.size() == 0) {   // stack ka size 0 hai to mtlb sab sahi hai
            System.out.println(true);
        } else {               // agar 0 nahi hai iska mtlb opening bracket jada the
            System.out.println(false);
        }
    }

    public static boolean handleClosing(Stack<Character> st, char corresoch) {
        if (st.size() == 0) {
            return false;
        } else if (st.peek() != corresoch) {   // corresponding opening character = ( match hua to TRUe nahi to false
            return false;
        } else {
            st.pop();
            return true;
        }
    }
}
/*
[(a +b) + { (c+d) * (e/f)}]
true

[(a +b) + { (c+d) * (e/f)]}
false
 */