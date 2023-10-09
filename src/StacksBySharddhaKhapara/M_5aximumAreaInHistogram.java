package StacksBySharddhaKhapara;
import java.util.*;
public class M_5aximumAreaInHistogram {
    public static void maxArea(int arr[]){ // array of height iske ander ham pass karege // final TL = O(n)-optimize
        // Next Smaller Right = O(n)
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];
        Stack<Integer>s = new Stack<>();
        for(int i = arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){  // ngr s.peek()] <= arr[i] bas itna change hoga
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        // Next Smaller Left = O(n)
         s = new Stack<>(); // yaha hamne stack ko khali kar diya hai kyoki uper stack bana hua hai
        for(int i =1;i< arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){   // badi value ko stack se hata dege kyoki hame chhoti value chahiye
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1; // stack khali menas value exist hi nahi karta hai
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // Current Area: width = j-i-1 = nsr[i] - nsl[i] -1 = O(n)
        for(int i =0; i<arr.length; i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] -1;
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);  // yaha ham hamesha compair karayege currArea ko maxArea se
        }
        System.out.println("max Area in histogram = " +maxArea);
    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3}; // height in histogram
        maxArea(arr);
    }
}

/*
output
max Area in histogram = 10

 */