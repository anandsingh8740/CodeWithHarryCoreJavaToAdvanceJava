package StacksBySharddhaKhapara;
import java.util.*;
public class R_6eveseA_Stack {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        //  cheque
        if (s.isEmpty()) {  // empty hai to directly push kar dena hai
            s.push(data);
            return;
        }
        // yaha hamne recursion se pushAtBottom ko kar diya tha O(n)
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void printStack(Stack<Integer>s){
        while(!s.isEmpty()){ // jab tak hamre stack se ham sare elements ko nikal nahi lete tab tak ham print karte jayege
            System.out.println(s.pop()); // s.pop() ko
        }
    }
    public static void reverseStack(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        // Recursivily isko ham aise solve karege ,uper jate jate ham top ko nikalte jayege
        int top = s.pop(); // yaha se top ki value ko nikal ja rahe hai
        reverseStack(s);  // top ko nikalne ke bad next call ham laga rahe hai
        pushAtBottom(s,top); //nich ate ate hai satck me vapash se nikali hui value ko push kar rahe hai botto  per
    }

    public static void main(String[] args) {
     // Create Stack
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        // 3 , 2 , 1  sabse pahle aise nikalega
        reverseStack(s);
        printStack(s); // ise dekhege ki stack reverse hua bhi hai ki nahi
        // 1 ,2 ,3  jaise hi stack revese hojayege to aisa ans ayega
    }
}
/*
1
2
3
 */