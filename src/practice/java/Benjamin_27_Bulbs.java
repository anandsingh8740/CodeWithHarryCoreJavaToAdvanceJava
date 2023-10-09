package practice.java;

import java.util.Scanner;
public class Benjamin_27_Bulbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1 ; i*i<=n; i++){ // i*i se time complexty sahi rahta hai aur isse loop ko bhi kam chalana
            //padta hai  //perfect squre ke liye i*i sahi rahta hai
            System.out.println(i*i);
        }
    }
}
/*
i/p 20
o/p :
1
4
9
16

25
1
4
9
16
25
*/