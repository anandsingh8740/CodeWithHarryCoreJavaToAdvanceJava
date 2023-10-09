package Stacks;

import java.util.Stack;

public class V_7alidParentheses {
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch ==  '[') {  // opening
                // stack ke ander jo push pop opration hue hai vo bhi ak bar element ander push ho raha hai
                // stack ke  ak bar bahar push ho raha hai stack ke
                s.push(ch);
            } else {
                // closing
                if (s.isEmpty()) {
                    return false;
                }
                if (( s.peek() == '(' && ch == ')' )          // ()
                        || ( s.peek() == '{' && ch == '}' )   // {}
                        || ( s.peek() == '[' && ch == ']' )) { // []
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
       // String str = "({})[]";  // true
        String str = "({})[";     // false
        System.out.println(isValid(str));
    }
}
