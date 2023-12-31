package Stacks;
import java.util.*;
public class R_6ightSideGraterElementShradhKhapara {   // O(n)
    public static void main(String[] args) {
        int[] arr = {6,8,0,1,3};
        Stack<Integer>s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for(int i = arr.length-1; i>=0;i--){
            // 1 while
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            };
           // 2 if - else
            if(s.isEmpty()){
                nxtGreater[i] = -1;
            }else{
              nxtGreater[i] = arr[s.peek()];
            }
            // 3 push in s
            s.push(i);
        }
        for(int i =0;i<nxtGreater.length;i++){
            System.out.print(nxtGreater[i] + " ");
        }
        System.out.println();

        // next Greater Right
        // nest Greater Left       int i =0 i<arr.length ; i++
        // next Smallest Right     s.peek() >= arr[i]
        // next Smaller Left for(int i =0;i<arr.length; i++)  .. arr[s.peek()] >= arr[i]
    }
}
// 8 -1 1 3 -1