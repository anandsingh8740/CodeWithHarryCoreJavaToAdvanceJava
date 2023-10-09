package com.company;
import java.util.Scanner;
class MyException extends Exception {
    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return  "I am getMessage()";
    }
}
class MaxAgeException  extends Exception {
    @Override
    public String toString() {
        return "Age cannot be grater than 125";
    }

    @Override
    public String getMessage() {
        return  "make sure that the value of age entered is correct";
    }
}
public class T32heExceptionClassInJava {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a < 9) {
            try {
                //throw new MyException();
                throw new ArithmeticException("This is an exception");
            } catch (Exception e) {
                System.out.println(e.getMessage());  // ye tab run hoga jab ham isko run karege
                System.out.println(e.toString());
                System.out.println(e);  // isme toString vala Method run hota hai
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes Finished");
        }
    }
}
// OUTPUT
/*
5
This is an exception
java.lang.ArithmeticException: This is an exception
java.lang.ArithmeticException: This is an exception
Finished
Yes Finished
java.lang.ArithmeticException: This is an exception
	at com.company.T32heExceptionClassInJava.main(T32heExceptionClassInJava.java:33)

 */