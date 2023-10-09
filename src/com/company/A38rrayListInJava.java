package com.company;
import java.util.*;  // isse sab kuch import kar sakte hai "Universal"
public class A38rrayListInJava {
    public static void main(String[] args) {
        // ArrayList declaration
       ArrayList<Integer> l1 = new ArrayList<> ();
        ArrayList<Integer> l2 = new ArrayList<> (5);  //(arrayList ki initial capicity set kar sakte hai ham)
        l2.add(15);
        l2.add(18);
        l2.add(19);

        l1.add(6); // add() inserts the specified element at the specific position in this.txt list
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0,5); // yaha per 0th position per 5 print hojayega
        l1.add(0,1); // same above but ye last me likha gaya hai isliye ye pahle print hoga

        //ensureCapacity()  // Increase the capacity of the ArrayList instance.50 to 500
        //l1.addAll(l2); //  l1 me l2 ko add karte hai aise addAll(l2) ye ending me add karega
        // System.out.println(l1.contains(7));//means kya 7 is ArrayList me hai O/P true
        System.out.println(l1.contains(27)); // O/P false
        l1.addAll(0, l2) ; //ye starting me add karega l2 ki value ko
        //l1.clear();   // clear() .. Remove all of the elements from this.txt list.
        //l1.indexOf(Object o) //Returns the index of the first occurrence of the specified element in this.txt list.
       // System.out.println(l1.indexOf(7)); // iska mtlb output me 7 ,6th position per hai //means 7th kis position per hai O/P me
       // System.out.println(l1.indexOf(15)); // O/P:  0th position per hai
        //System.out.println(l1.indexOf(159));  // O/P : -1 kyoki ye value hai hi nahi
        System.out.println(l1.indexOf(6)); // O/P: 5 means ye pahle vale number ka index lega
        System.out.println(l1.lastIndexOf(6)); // means ye last vale index ka 6th lega
        l1.set(1,566); //means kis index per koin si value dalna chahate hai
        for(int i =0; i<l1.size(); i++){
            //l1.get()  method ka use karke sabhi ko print kara sakte hai
            System.out.print(l1.get(i));
            System.out.print(" , "); //means o/p me 6th position per 7 hai
        }
    }
}
