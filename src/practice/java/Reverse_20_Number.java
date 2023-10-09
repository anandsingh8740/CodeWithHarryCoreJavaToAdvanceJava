package practice.java;

import java.util.Scanner;

public class Reverse_20_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=0){
            int q = n%10;
            System.out.println(q);
             n = n/10;
        }
    }
}
/*
654321
1
2
3
4
5
6
 */