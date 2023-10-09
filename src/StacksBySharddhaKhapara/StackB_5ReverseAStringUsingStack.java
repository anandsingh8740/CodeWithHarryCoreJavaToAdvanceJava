package StacksBySharddhaKhapara;
import java.util.*;
public class StackB_5ReverseAStringUsingStack {
    public static String reverseString(String str){
        Stack<Character>s = new Stack<>();
        int idx =0;
        while(idx < str.length()){
            s.push(str.charAt(idx));  // sare ke sare character ko apne stack me push kar dege
            idx++;
        }
        // reverse karne ke liye ..ham new resulting string bana lenge
        StringBuilder result = new StringBuilder(""); // ab stack se character ko bahar nikalege ..char ko bahar then
        // string builder me dal denge  ..stack se char ko tab tak bahar nikalege jab tak vo string empty nahi ho jata hai
        while (!s.isEmpty()){
            char curr = s.pop(); // ak ak char ko bahar nikalege
            result.append(curr); // append means last me value add kar deta hai
        } // isPrakar sab string reverse order me store ho jayege

        return result.toString(); // yaha per ham apna res store kar dege
    } // stringBulder ki value ko jab hame String me store karna rahta hai to hame .toString() vala fun use karna padta hai

    public static void main(String[] args) {
      //  String str = "abc"; // OUTPUT: cba
      //  String str = "HelloWorld"; // OUTPUT: dlroWolleH
        String str = "Hello World";  // OUTPUT : dlroW olleH
        String result = reverseString(str);
        System.out.println(result);
    }
}
