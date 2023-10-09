package com.company;
class MyNewThr1 extends Thread{
public void run(){   //method isi me sab kuch run hoga
       int i =0;
        while(true){
        //  System.out.println("I am Thread");
        System.out.println("Thank you: ");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
   }
}
class MyNewThr2 extends Thread{
    public void run(){   //method isi me sab kuch run hoga
        while(true){
            //  System.out.println("I am Thread");
            System.out.println("My Thank you: ");
        }
    }
}
public class J24avaThreadMethods {
    public static void main(String[] args) {
       MyNewThr1 t1 = new MyNewThr1();
       MyNewThr2 t2=  new MyNewThr2();
       t1.start();
//       try{  // kosis karte hai iske ander
//           t1.join();  // try ke ander ham kosis karte hai code ke run hone ki
//       } // agar koi error exception throw hoti hai to catch ke ander ham dal dete hai aur vo handle hojati hai
//       catch(Exception e){   // iska use tab ham karte hai jab "try" chal nahi sakta  catch ke ander vo chig
//           // hamlog dal dete hai ki isse ham tab vo karva chahate hai "JAb ye Chal nahi sakta"
//           System.out.println(e);
//           }
      // t1.join();  // isse likhane se t1 jab tak pura print nahi hojayega tab tak print hoga ..uske bad t2 print oga
       t2.start();
    }
}
