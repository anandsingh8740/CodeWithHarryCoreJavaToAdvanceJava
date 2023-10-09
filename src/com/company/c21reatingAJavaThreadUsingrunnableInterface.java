// Creating a java Thread Using Runnable "Interface"
// ye thread ka dusara tarika hai implement karne ka
// isko ham Runnable interface ko implement karke karte hai
package com.company;
class MyThreadRunnable1 implements Runnable{
    //Runnable interface me hota ak method hota hai ak aisa method hota hai jisko hame implement karna hota hai
    public void run(){ // nahi isko likhenge to ...ye chalane hi nahi dega program ko
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");
        System.out.println("I am a thread 1 not a threat 1");

    }
}
class MyThreadRunnable2 implements Runnable {
    public void run() { // for loop ya while loop laga lenge
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");

    }
}
    public class c21reatingAJavaThreadUsingrunnableInterface {
        public static void main(String[] args) {
            MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
            Thread gun1 = new Thread(bullet1);// ye java ke ander By design hai hamne nahi banaya hai
            //Thread gun1 = new Thread(ham isme pass karege);
            MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
            Thread gun2 = new Thread(bullet2);
            gun1.start();
            gun2.start();

        }
    }

