package com.company;

public class F34inallyBlockInJavaAndWhyIsItNeeded {
    public static int greet() {
        try {
            int a = 50;
            int b = 10;
            int c = a / b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        }
        // finally har hal me run hokar hi manaega
        finally{  //is block ham vo code dalenge jisko ham hamesha har hal me execute karvana chahate hai
            System.out.println("Cleaning up resources....This is the end of this.txt function");
        }
       // return 0;   // try ke ander nahi jayega isiliye return 0 likhe hai
        return -1 ; //means hamara error or exception aagayi hai
    }

    public static void main(String[] args) {
       // greet();  o/p This is the end of this.txt function
        int k = greet();
        System.out.println(k);
        int a =7;
        int b =9;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            finally{  // finally kisi bhi hal me execute hoga hi hoga chahe ham break akr le chahe ham kisi func se
                // return kar le chahe kuch bhi kar le chahe exception aye ya na aye finally hamesha execute hoga
                System.out.println("I am finally for value of b = " +b);
            }
            b--;
        }
        try{  //try ke sath finally ka use kar sakte hai ...means ham ne yaha per exception ko handle nahi kiya hai
            System.out.println(50/3);
        }
        finally{
            System.out.println("Yes this.txt is finally");
        }
    }
}