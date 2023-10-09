package prepcodingFunction;

import java.util.Scanner;
public class fun2_1decitoanybase {
    public static int decitoanyBase(int n , int b){
        int rv =0;
        int p =1;
        while(n!=0){
          int  dig = n%b;
            n = n/b;
            rv += dig*p;
            p = p*10;
        }
        return rv;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int Dec = decitoanyBase(n ,b);
        System.out.println(Dec);
    }
}

/*
13
2
1101
 */