package com.company;

class MyThr extends Thread{
    public MyThr(String name){     // constructorn // har thread ko ak id bhi di jati hai ,to isko bhi ham
        //print kar sakte hai
        super(name);  // Thread class ka constructor already name leta hai

    }
    public void run(){   //method isi me sab kuch run hoga
        int i =34;
        System.out.println("Thank you");
//        while(true){
//            System.out.println("I am Thread");
//        }

    }
}
public class c22onstructorFromThreadclass {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Harry");
        MyThr t2 = new MyThr("Ram Candr");
        t1.start();    // isse Thread start hojayega
        t2.start();
        // getId() ak method hai joki hamlogo ki is thread ki id dega
        System.out.println("The id of the Thread t is " + t1.getId());
        System.out.println("The name of the Thread t is " + t1.getName());
        System.out.println("The id of the Thread t is " + t2.getId());
        System.out.println("The name of the Thread t is " + t2.getName());
    }
}
/* OutPut
The id of the Thread t is 23
The name of the Thread t is Harry
The id of the Thread t is 24
The name of the Thread t is Ram Candr

 */