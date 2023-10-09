package prepcodingFunction;

import java.util.Scanner;
public class fun3_AnyBasetoDecimal {
    public static int conversion(int n , int b){
        int rv =0;
        int p=1;
        while(n>0){
            int dig = n%10;
            n = n/10;
            rv +=dig *p;
            p= p*b;
        }
        return rv;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int d = conversion(n , b);
        System.out.println(d);
    }
}
/*
1172
8
634
 */