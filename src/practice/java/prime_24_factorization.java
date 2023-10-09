package practice.java;

import java.util.Scanner;

public class prime_24_factorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int div =2; div*div <=n; div++){
            while(n%div ==0){
                n = n/div;
                System.out.print(div + " ");
            }
        }
        if(n!=1){   // agar n kat kar 1 nahi bana hai to ham ise hue karege like 23/5 = 1 nahi bana hai ..5/5=1
            System.out.print(n);
        }
    }
}
/*
1440
2 2 2 2 2 3 3 5

46
2 23
 */