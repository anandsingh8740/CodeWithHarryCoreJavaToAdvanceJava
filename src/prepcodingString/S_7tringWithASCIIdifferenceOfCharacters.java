package prepcodingString;

import java.util.Scanner;

public class S_7tringWithASCIIdifferenceOfCharacters {
    public static String Solution(String str){
        StringBuilder sb = new StringBuilder();  // yaha empty string builder hai to empty me kuch add karne per vahi value rahegi jo hamne add kiya hai
        sb.append(str.charAt(0));
        // System.out.println(sb);
         for(int i =1; i< str.length();i++){
             char curr = str.charAt(i);
             char prev = str.charAt(i-1);
             int gap = curr - prev;
             sb.append(gap);
             sb.append(curr);
         }
         return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(Solution(str));
    }
}

/*
abdgca
a1b2d3g-4c-2a

 */