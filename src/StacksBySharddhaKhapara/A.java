package StacksBySharddhaKhapara;

import java.util.Stack;

public class A {
    public static int[] solve(int[] arr) {
        int[] span = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        span[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            while (st.size() > 0 && arr[i] > arr[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                span[i] = i + 1;

            } else {
                span[i] = i - st.peek();
            }
            st.push(i);
        }
        return span;
    }
    public static void main(String args[]){
        int stocks[] = {100 , 80 , 60 ,70,60,85,100};
        int span[] = new int[stocks.length] ;   // ye hai span ke liye Array
        solve( span);

        for(int i =0; i<span.length;i++){ // print span
            System.out.println(span[i]+ " ");
        }
    }
}
