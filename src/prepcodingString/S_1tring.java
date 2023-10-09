package prepcodingString;

import java.util.Scanner;
public class S_1tring {
    public static void main(String[] args) {
        //String s2 = "Hello";
//        Scanner sc = new Scanner(System.in);
//        String s1 = sc.nextLine();
//        System.out.println(s1);
//        System.out.println(s1.length());
        // array me koi element nikalana ho to aise likhte the  "s[0],s[1] karke"but isme dusare tarah se karege
       // char ch = s1.charAt(2);  // char aise likhale hai
//        for(int i =0 ;i<s1.length();i++){
//            char ch = s1.charAt(i); // Tatal char aise print hoga
//            System.out.println(ch);
            // can not change value in String like Arrays
            // String ka character ham change nahi kar sakte hai
       // String s = "abcd";
//        System.out.println(s.substring(1,3)); //bc
//        System.out.println(s.substring(1)); // bcd
//        for(int i =0;i<s.length();i++){
//            for(int j =i+1; j<= s.length();j++) {
//                System.out.println(s.substring(i , j));
/*       // print all substring
a
ab
abc
abcd
b
bc
bcd
c
cd
d
                 */

      //  String s1 = "hello";
//        String s2 = "world";
////        String s3 = s1 + " " + s2;
//        s1 += ' ';
//        s1 += 'w';
//        s1 += 'o';
//        s1 += 10; // string me char aur int dono ko add kar sakte hai ham
//        System.out.println(s1); // hello wo10
//   System.out.println("Hello" + 10 + 20); //Hello1020 .. left to write ki vajay se aya hai left pahle string
// bana liya hai sabko convert kar diya hai pahle 10 ko uske bad 20 ko string me convert karke print kar diya hai
// System.out.println(10 + 20 + "hello"); // 30hello  pahle int me convert kake add kiya hai phir strig ko add kiya hai

       // String s = "abc def ghi jkl mno"; // yaha hamne space se seprate kiya hai
        String s1 = "abc,def,ghi,jkl mno"; // yaha hamne "comma" se seprate kiya hai
        //String[] parts = s.split(" ");// parts Name ka Array ban jayega (parts arry hai strig ka)to ye narmal array hai
        String[] parts1 = s1.split(",");

        for(int i =0;i<parts1.length;i++){
            System.out.println(parts1[i]);

            /*
abc
def
ghi
jkl
mno
   */
            /* ye comma vale ka output hai
abc
def
ghi
jkl mno
             */
        }

    }
}


