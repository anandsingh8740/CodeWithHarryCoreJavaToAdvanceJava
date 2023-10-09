package practice.java;

import java.util.Scanner;

public class primrNumberTimeComplexity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0; i<t;i++){
            int n = sc.nextInt();
            int count =0;
            for(int dev =2; dev*dev<= n;dev++ ){ // koi bhi value apne square root tak ya uske ander vo divide
                //ho jati hai.   // n= 16 ;to ye div 4 ya isse niche ki value se divide hojayegi agar isse nahi
                //hui to kisi se nahi hogi // isse time complexity sahi rahega
                if(n%dev ==0){
                    count++;
                    break;
                }
            }
            if(count==0){ // means ak bar bhi divide na ho jab ham do se hi start kar rahe hai ..1 to count
                //hi nahi kiye hai
                System.out.println("prime");
            }else {
                System.out.println("not Prime");
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
not Prime
24
not Prime

 */