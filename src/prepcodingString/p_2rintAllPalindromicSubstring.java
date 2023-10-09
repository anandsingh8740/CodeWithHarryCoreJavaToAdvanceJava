package prepcodingString;

import java.util.Scanner;
// Palindrome means first and last value is same
public class p_2rintAllPalindromicSubstring {
    public static boolean isPalindrome(String s){
        int i =0;
        int j = s.length()-1;
        while(i<=j){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if(ch1 != ch2){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
    public static void solution(String s){
        for(int i =0; i< s.length();i++){
            for(int j = i+1; j<= s.length();j++){
               String st = s.substring(i , j); // sari substring print nahi karna hai jo palindrome ho usko karna hai
               if(isPalindrome(st)==true){  // Palindrome  // agar Palindrome() vala function true
                   System.out.println(st); // ayega tabhi print karege
               }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        solution(s);

    }
}
/* i/p  abccbc
o/p
a
b
bccb
c
cc
c
cbc
b
bc
c
 */