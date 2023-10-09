package com.company;

import java.util.Scanner;

public class P35racticeSet14 {
    public static void main(String[] args) {
        //Q:1 Write a java program to demonstrate syntax, logical & runtime errors.
        //Syntax error - int a =7
        int age = 78;
        int year_born = 2000 -78; // Logical error (karna kuch aur chahate the hogaya kuch aur)
        //System.out.println(6/0);
        /* Q1 : O/P
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	    at com.company.P35racticeSet14.main(P35racticeSet14.java:9)
         */

  // Q2:- Write a java program that prints "HaHa" during Arithmetic exception and "HeHe" during an Illegal
       // argument exception.

        try{
            int a = 666/0;
        }
        catch(IllegalArgumentException e){
            System.out.println("HeHe");
        }
        catch(ArithmeticException e){
            System.out.println("HaHa");
        }
        /* Q3:- Write a program that allows you to keep accessing an array until a valid index is given.
           If max returns exceed 5 print "Error".  */
        boolean flag = true;
        int[] marks = new int[3];
        marks[0] =7;
        marks[1] =56;
        marks[2] = 6;
        Scanner Sc = new Scanner(System.in);
        int index;
        int i =0;
        while(flag && i<5){
            try{
                System.out.println("Enter the value of index");
                index = Sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                break;
            }
            catch(Exception e){
                System.out.println("Invalid Index");
                i++;
            }
        }
        if(i>=5){
            System.out.println("Error");
        }
    }
}
/* O/P : Q3
HaHa
Enter the value of index
11
Invalid Index
Enter the value of index
12
Invalid Index
Enter the value of index
13
Invalid Index
Enter the value of index
14
Invalid Index
Enter the value of index
15
Invalid Index
Error

 */