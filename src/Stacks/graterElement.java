package Stacks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class graterElement {
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();

        for(int val :a){
            sb.append(val + "\n ");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i =0; i<n;i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        int[] nge = solve(a);
        display(nge);
    }
    public static int[] solve(int[] arr) {
        int[] nge = new int[arr.length];  // nge new grater element

        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length - 1]);
        nge[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            // - a +  -(pop) a(ans) +(push)
            while (st.size() > 0 && arr[i] >= st.peek()) { // tab tak pop karege jab tak ye condition true rahegi
                st.pop(); // jab tak stack khali na hojaye ...>0 jab tak stack me log hai tab tak pop karege
                // aur stack of i stack ke top vale se bada hai  // rukege tab jab yato stack ke top per usse
                // bada element aa jaye ..ya stack khali hojaye
            }
                if (st.size() == 0) { // sbko khali kar diya to
                    nge[i] = -1;
                } else {
                    nge[i] = st.peek();   // means stack ke top per isse koi bada aagaya is case me iska javab
                    // stack ka top hi iska javab hai
                }
                st.push(arr[i]);   // jate jate ye khud ko stack me push kar dega  kyoki ye element left vaka
                // ka khud bhi left vala ka gratest element to the right ho sakta hai

            }
            return nge;
        }
    }

