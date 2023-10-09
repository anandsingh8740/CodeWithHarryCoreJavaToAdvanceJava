// Creating a Thread By "Extending" Thread class
// jaB ham niche thread ko start kerege to ham ise isme method karunga run se nahi karunga    ->  imp
package com.company;
class MyThread1 extends Thread{     //create clas with the help of inharitance
    @Override
    public void run(){
        //while(true){      // infinite loop  isse infinite bar code run karega
          int i =0;
          while(i<40000){
            System.out.println("My Cooking Thread is Running");
            System.out.println("I am happy!");
            i++;
        }

    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){  // run method override hua hai
      //  while(true){      // infinite loop
        int i =0;
        while(i<40000){
            System.out.println("My Thread 2 Chatting with her");
            System.out.println("I am sad!");
            i++;
        }

    }
}
public class c20reatingAThreadByExtendingThreadClass {
    public static void main(String[] args) {
    MyThread1 t1 = new MyThread1();  // jab iske method ham banayege tab ye run karega
    MyThread2 t2 = new MyThread2();
    t1.start();    // ak Thread ko start karne  ke liye hame start method chalana  padta hai
    t2.start();    // start method run method ko apne hisab se internally call kar leta hai
    // ye sari implimentation thread.java ke ander hai jiske ander hame nahi jana hai
   // isse faster execution prapt hote hai
    }
}
