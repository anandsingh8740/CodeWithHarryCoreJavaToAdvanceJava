package CollectionFramWorkByCollegeWallah;

import java.util.*;

public class ListInterfaceExample1 {
    static void ArrayListExamples() {
       // ArrayList<Integer> l = new ArrayList<>(); // banane ka tarika bilkul same hai
        LinkedList<Integer> l = new LinkedList<>(); // same work karege linkedlist and ArrayList
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l); // [1, 2, 3]
        System.out.println(l.get(1));   // 1-based indexing  => 2// kisi method ko retrive karna hai to get method ka use karege
        l.set(1, 10); // modify at index i
        System.out.println(l); // [1, 10, 3]
        System.out.println(l.contains(10)); //true
    }

    // Stack
    static void StackExample(){
        Stack<String>st = new Stack<>();
        st.push("pw");
        st.push("skills");
        System.out.println(st.peek());  // skills
        System.out.println(st.pop()); // Skills(wikk also remove it)
        // ye pick se kuch bhi change nahi karta hai ye shirf read karta hai
        System.out.println(st.peek()); // pw
        System.out.println(st.size());  // 1
        System.out.println(st.empty()); //false
    }
    public static void main(String[] args) {
        //ArrayListExamples();
        StackExample();
    }
}
