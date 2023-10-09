package com.company;
class MyThr1 extends Thread{
    public MyThr1(String name){     // constructorn // har thread ko ak id bhi di jati hai ,to isko bhi ham
        //print kar sakte hai
        super(name);  // Thread class ka constructor already name leta hai

    }
    public void run(){   //method isi me sab kuch run hoga
        int i =34;
        System.out.println("Thank you" + this.getName());
        while(true){
          //  System.out.println("I am Thread");
            System.out.println("Thank you " + this.getName());
        }

    }
}
public class J23avaThreadPriorties {
    public static void main(String[] args) {
        //JVM jo hoti hai usko ak Reddy Queue: ke ander hame vo sare thread milege vo jo ji READY TO RUN hai
        //Ready Queue : T1 T2 T3 T4 T5 ye sab javm dura maintain ki jati hai ..yani ki jvm ke pass in 5vo thread
        // ko run karne ki jimmedari hai ..aur insab ko cpu pradan karana hai

        MyThr1 t1  = new MyThr1("Harry1");
        MyThr1 t2 = new MyThr1("Harry2");
        MyThr1 t3  = new MyThr1("Harry3");
        MyThr1 t4  = new MyThr1("Harry4");
        MyThr1 t5  = new MyThr1("Harry5 (most Important)");
        t5.setPriority(Thread.MAX_PRIORITY);  // isse priotity set hojayegi
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
