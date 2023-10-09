package com.company;

import java.util.*;

public class L40inkedListInJava {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new  LinkedList<> ();
        LinkedList<Integer> l2 = new  LinkedList<> ();  //(6) LinkedList me initial capacity nahi dete hai
        l2.add(15);
        l2.add(18);
        l2.add(19);
   // LinkedList aur ArrayList me lagbhag same hai but "internal Working" differance hai thoda bahut
        l1.add(6); // add() inserts the specified element at the specific position in this.txt list
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0,5);
        l1.add(0,1);
        System.out.println(l1.contains(27)); // O/P false
        l1.addAll(0, l2) ;
        l1.addLast(676); // ye ArrayList me nahi hota hai function ..."at the last element  add kar dega"
        l1.addFirst(788); // ye pahle element add hojayega
        System.out.println(l1.indexOf(6)); // O/P: 5 means ye pahle vale number ka index lega
        System.out.println(l1.lastIndexOf(6)); // means ye last vale index ka 6th lega
        l1.set(1,566);
        for(int i =0; i<l1.size(); i++){
            //l1.get()  method ka use karke sabhi ko print kara sakte hai
            System.out.print(l1.get(i));
            System.out.print(" , "); //means o/p me 6th position per 7 hai
        }
    }
}
// OUTPUT
/*
false
6
9
788 , 566 , 18 , 19 , 1 , 5 , 6 , 7 , 4 , 6 , 676 ,
 */



