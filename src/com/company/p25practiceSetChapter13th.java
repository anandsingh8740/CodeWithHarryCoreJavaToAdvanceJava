package com.company;
/*
Q1:-Write a program to print "good morning" and "welcome" continuously on the screen in java using Threads
Q2 :- Add a sleep method in welcome thread of question1 to delay its execution for 200ms
Q3 :- Demonstrate getPriority() and setPriority() methods in java Threads
Q4 :- How do you get "state" of a given thread in java   ->> use getState() function
Q5:- How do you get reference to the current Thread in Java?
 */
class Practice13 extends Thread {
    public void run() {
        while (true) {
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Good Morning");
        }
    }
}
class Practice13b extends Thread {
    public void run() {
//        while (false) {
//            try {
//                Thread.sleep(200); //Q 2
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//            System.out.println("Welcome");
//        }
    }
}
public class p25practiceSetChapter13th {
    public static void main(String[] args) {
        Practice13 p1 = new Practice13();
        Practice13b p2= new Practice13b();
//        p1.setPriority(6);
//        p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p2.getState()); // Q 4 //NEW
//        p1.start();
       p2.start();
        System.out.println(p2.getState()); // RUNNABLE  state hamesa change hoti rahti hai
        System.out.println(Thread.currentThread().getState());  // Q5  //OUTPUT RUNNABLE
    }
}
