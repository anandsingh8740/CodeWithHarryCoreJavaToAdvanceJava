package prepcodingFunction;

import java.util.Scanner;

public class function1 {
    public static int fact(int x){
        int rev =1;
        for(int i =1;i<=x;i++){
            rev = rev*i;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
//        int nfact =1;
//        for(int i =1; i<=n;i++) {
//            nfact *= i;
//        }
        int nfact = fact(n);
//            int nmrfact = 1;
//            for (int j = 1; j <= (n-r); j++) {
//               nmrfact*=j;
//            }
        int nmrfact= fact(n-r);
           int npr = nfact / nmrfact;
        System.out.println(npr);
        }
    }
/*
5 2
20

 */
