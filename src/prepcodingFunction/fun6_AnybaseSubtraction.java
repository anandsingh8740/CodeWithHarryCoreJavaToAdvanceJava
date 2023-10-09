package prepcodingFunction;

import java.util.Scanner;

public class fun6_AnybaseSubtraction {
    public static int addition(int n1 , int n2 , int b) {
        int rv = 0;
        int p = 1;
        int c =0;
        while (n2>0) {
            int d1 = n1 % 10;
            n1 = n1/10;
            int d2 = n2 % 10;
            n2 = n2 / 10;
            int d =0; // int d;
            d2 = d2 +c;  // pichala carry -1 add hojayega agar bacha hai to nahi to 0 add hojayega 
            if(d2 >=d1){
                c =0;
                d = d2 - d1;
            }else{
                c = -1;
                d = d2 + b - d1;
            }
            rv = rv + d*p;
            p = p*10;
        }
        return rv;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int b = sc.nextInt();
        int add = addition(n1,n2,b);
        System.out.println(add);
    }
}

/*
236
1212
8
o/p 754
 */
