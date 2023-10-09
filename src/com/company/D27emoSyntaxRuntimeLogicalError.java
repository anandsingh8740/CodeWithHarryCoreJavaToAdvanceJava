package com.company;
import java.util.*;
public class D27emoSyntaxRuntimeLogicalError {
    public static void main(String[] args) {
        // SYNTAX ERROR DEMO
        //int a =0 // Error : no semicolon!
        // b=8; // Error : b not declared!
        // Logical Error Demo
        // Write a program to print numbers between 1 to 10
        System.out.println(2);
        for(int i =1; i<5; i++) {
            System.out.println(2 * i + 1);  // isme 9 print hoga jo ki Prime number nahi hai ..."To ye logical Error Hua"
        }
            // RUNTIME ERROR
            int k;
            Scanner sc = new Scanner(System.in);
            k =sc.nextInt();
            System.out.println("Integer part of 1000 divided by k is " + 1000/k);
        }
    }

    /*  OUTPUT
    2
3
5
7
9
0  // 0 input dene ki vajay se ye error aya hai //iske jagah per koi aur digit rakhege(2,4,6) to error nahi ayega
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.company.D26emoSyntaxRuntimeLogicalError.main(D27emoSyntaxRuntimeLogicalError.java:18)

 */
