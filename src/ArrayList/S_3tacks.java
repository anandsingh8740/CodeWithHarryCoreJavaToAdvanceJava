package ArrayList;
import java.util.*;
public class S_3tacks {
    public static void fun(int[][]arr){
        for(int i =0; i< arr.length;i++){
            for(int j =0; j <arr[i].length;j++){
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10); // push value ko starting se dalata hai (Stack)
        st.push(20);
        st.push(30);
        System.out.println(st);  // [10, 20, 30]
        st.push(40);
        System.out.println(st);  // [10, 20, 30, 40]

    // peek() function hame top ki position batata hai
        System.out.println(st.peek());   // 40
        System.out.println(st);  // [10, 20, 30, 40]

    // pop() fuc sabse uper vale element ko remove kar deta hai
        System.out.println(st.pop()); // ye 40 ko remove kar dega // 40 mila bhi aur niche 40 ko remove kardega
        System.out.println(st);  // [10, 20, 30]
        // means ye pahle jis value ko remove karna rahega usko print(st.pop()) karega uske bad SOUT(st) karne
        // per niche remove vale value ko chhod kar print kar dega

        // --peak() batayega value aur remove nahi karega ---pop() value batayega aur remove kar dega
    }
}
