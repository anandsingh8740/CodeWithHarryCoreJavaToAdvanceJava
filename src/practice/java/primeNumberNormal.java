package practice.java;

import java.util.*;
public class primeNumberNormal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0;i<t; i++){
             int n = sc.nextInt();
             int count =0;
             for(int dev =1; dev <= n;dev++){
                 if(n% dev ==0){
                   count++;
                 }
             }
             if(count==2){
                System.out.println("prime");
            }else{
                 System.out.println("not prime");
            }
        }
    }
}

/*
5
7
prime
2
prime
11
prime
18
not prime
24
not prime

 */