package Stacks;
import java.io.*;
import java.util.*;
public class S_9tockSpanPrepCoding {
        public static void display(int[] a) {
            StringBuilder sb = new StringBuilder();
//        int nxtGreater[] = new int[arr.length];

            for (int val : a) {
                sb.append(val + "\n ");
            }
            System.out.println(sb);
        }

        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(br.readLine());
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(( br.readLine() ));
            }
            int[] span = solve(a);
            display(span);
        }

        public static int[] solve(int[] arr) {
            int[] span = new int[arr.length];
            Stack<Integer> st = new Stack<>();
            st.push(0);
            span[0] = 1;   // span hamesha index+1 hoga
            // 1 se loop lagayege
            for (int i = 1; i < arr.length; i++) {
                while (st.size() > 0 && arr[i] > arr[st.peek()]) {
                    st.pop();
                }
                if (st.size() == 0) {  // jab rukege to dekhege ki stack ka size kaisa hai ..agar stack ka size 0
                    //(zero) kar diya to .. hamne sabhi ko pop() kara diya..to hamse kooi chhota hai hi nahi
                    span[i] = i + 1;

                } else {
                    span[i] = i - st.peek(); // agar ham sabko pop nahi kara paye to [i - st.peek()] jo hamse bada
                    // hamare left per hai uska index  // peek me hamre left me hamse jo bada tha uska index
                }
                st.push(i);   // last me ham push kar dege
            }

            return span;
        }
    }

/*
1 0 3 4 5 6 1
o/p 1 1 3 4 5 6 1 ........but mere compiler me error show kar raha hai but logic sahi hai

Exception in thread "main" java.lang.NumberFormatException: For input string: "1 0 3 4 5 6 1"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:665)
	at java.base/java.lang.Integer.parseInt(Integer.java:781)

 */