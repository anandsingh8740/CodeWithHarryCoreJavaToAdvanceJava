//package Stacks;
//
//import java.util.Stack;
//
//public class S_10 {
//    public static int[] solve(int[] arr) {
//        int[] span = new int[arr.length];
//        Stack<Integer> st = new Stack<>();
//        st.push(0);
//        span[0] = 1;   // span hamesha index+1 hoga
//        // 2 se loop lagayege
//        for (int i = 1; i < arr.length; i++) {
//            while (st.size() > 0 && arr[i] > arr[st.peek()]) {
//                st.pop();
//            }
//            if (st.size() == 0) {  // jab rukege to dekhege ki stack ka size kaisa hai ..agar stack ka size 0
//                //(zero) kar diya to .. hamne sabhi ko pop() kara diya..to hamse kooi chhota hai hi nahi
//                span[i] = i + 1;
//
//            } else {
//                span[i] = i - st.peek(); // agar ham sabko pop nahi kara paye to [i - st.peek()] jo hamse bada
//                // hamare left per hai uska index  // peek me hamre left me hamse jo bada tha uska index
//            }
//            st.push(i);   // last me ham push kar dege
//        }
//
//        return span;
//    }
////}
//
//    public static void main(String[] args) {
//        int [] arr = {1,0,3,4,5,6,1};
//        System.out.println(solve(arr));
//    }
//}
