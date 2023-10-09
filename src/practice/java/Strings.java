package practice.java;

import java.util.Scanner;
import java.util.*;
public class Strings {
    public static void main(String[] args) {
        String name ="Harry";
        String anand = "Adarsh";
//        System.out.println(name.substring(4));
//        System.out.println(anand.substring(4));
//        System.out.println(name.substring(0,3)); // Har
//        System.out.println(anand.substring(0,3)); // Ada
//        System.out.println(name.replace('a','P')); //HPrry
//        System.out.println(anand.replace('d','D')); //ADarsh
//        System.out.println(name.startsWith("Ha"));  //true
//        System.out.println(anand.startsWith("Ada")); //true
//        System.out.println(anand.startsWith("es"));  // false
//        System.out.println(name.endsWith("ry"));  //true
//        System.out.println(anand.endsWith("sh")); //true
//        System.out.println(name.endsWith("ys"));  //false
//        System.out.println(anand.endsWith("se")); //false
//        System.out.println(name.charAt(4));  // y
//        System.out.println(anand.charAt(4)); // s
//        System.out.println(anand.charAt(6)); // out of bounds for length
//        System.out.println(name.indexOf("ry")); //3
//        System.out.println(anand.indexOf('r')); // 3
//        System.out.println(anand.indexOf("sh")); //4
//        System.out.println(name.indexOf("ed")); // -1 means value nahi hai
//        System.out.println(name.indexOf("s" ,3));  //-1
//        System.out.println(name.indexOf('a' ,0)); //means ye jo value(0) put karege vaha de aage tak me
//        // sentence ko search karega                            // 1
//        System.out.println(anand.indexOf("sh",1)); // 4
//        System.out.println(anand.indexOf('h',1));  // 5 // it is position or index number
//        System.out.println(anand.indexOf('d' ,3)); // -1 // not meet index then return value -1
//        System.out.println(name.lastIndexOf('r')); //3
//        System.out.println(anand.lastIndexOf("rs"));  //3
//        System.out.println(name.lastIndexOf("r" ,4)); //3
//        System.out.println(anand.lastIndexOf("ar",5)); //2
//        System.out.println(anand.lastIndexOf("ad",5)); //-1
//        System.out.println(anand.lastIndexOf("ar",5)); // 2
//        System.out.println(name.equals("Harry"));    //true
//        System.out.println(anand.equals("Satish")); // false
//        System.out.println(anand.equals("adarsh")); // false
//
//        System.out.println(anand.equalsIgnoreCase("adarsh")); // true // means isse case senstive per eeffect nahi padta hai
//        System.out.println(name .equalsIgnoreCase("harry")); // true

        //String Builder
       // String builder is mutable means ...ki value change kar sakte hai "Kabgi bhi" .. but String me nahi kar sakte hai
//        StringBuilder str = new StringBuilder("Satish");
//        System.out.println(str);  //Satish
//        System.out.println(str.charAt(0)); // S
//          str.setCharAt(0, 'A'); // aise declear karna important hai
//        System.out.println(str); // Aatish
//
//        str.insert(2,'r');
//        System.out.println(str);  // Aartish  // metalb jo position mention kiya hu "usjagah per jo character hai
//        // "add" hojayega aur pahle ki value ak step age chali jayegi
//         str.delete(2 , 5);
//        System.out.println(str); //Aash
//        str.delete(1,2);
//        System.out.println(str); //Ash

      // append :- append character ko last me add karta hai
//    StringBuilder sb = new StringBuilder("h");
//    sb.append("e");
//    sb.append("l");
//    sb.append("l");
//    sb.append("o");
//    sb.append('s');
//    sb.append('i');
//    sb.append('r');
//    System.out.println(sb);
  //  System.out.println(sb.length());
        //StringBuilder sb = new StringBuilder("hello");
        String sb = "hello";
        String rev = "";
        for(int i=sb.length()-1;i>=0; i--){
         rev = rev + sb.charAt(i);
        }
        System.out.println(sb); //hello
        System.out.println(rev); //olleh
    }

}
