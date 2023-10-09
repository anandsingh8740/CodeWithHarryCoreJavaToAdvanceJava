package com.company;

public class T28rycatchBlock {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;  // iske niche int c =a/b; likhe hai to ye ArithmeticExecption diya hai to isliye hame try -catch ka use karna padega isko dur kare ke liye
        // without Try
//        int c = a/b;
//        System.out.println("The result is " +c);

        // with Try;
        try {
            int c = a / b;
            System.out.println("The result is " + c);
        } catch (Exception e) {
            System.out.println("We failed to divide. Reason:");
            System.out.println(e);
        }
        /* Output
        We failed to divide. Reason:
        java.lang.ArithmeticException: / by zero
        End of the program
         */
        System.out.println("End of the program");
    }
}