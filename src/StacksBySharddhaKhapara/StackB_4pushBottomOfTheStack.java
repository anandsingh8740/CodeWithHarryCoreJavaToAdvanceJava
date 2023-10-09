package StacksBySharddhaKhapara;

import java.util.*;
public class StackB_4pushBottomOfTheStack {
    public static void pushAtBottom(Stack<Integer> s,int data){
    if(s.isEmpty()){  // ak time aisa ayega jab hamara stack pura ka pura khali hojayega
        s.push(data); // is case me ham apne data ko push kardege yani ki 4 ko
        return;
    }
        int top = s.pop();   // uper jate hue element ko remove karna hai
        pushAtBottom(s,data);  // agle level ke liye call lagani hai
        s.push(top);  //  vapas ate time jo element ko hamne stack se nikala tha usko phir se push kar dege
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottom(s,4);
        while (!s.isEmpty()){  // loop tab tak chalayege jab tak ye empty na ho jaye
            System.out.println(s.pop());
        }
    }
}
/*
3
2
1

 */