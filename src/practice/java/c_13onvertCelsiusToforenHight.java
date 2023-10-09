package practice.java;

import java.util.Scanner;

public class c_13onvertCelsiusToforenHight {
    static double CtoF(int c){
        //double c =40;
       // double F = (c*9/5)+ 32;
        return ( c * (9.0/5.0) + 32 );
    }
    public static void main(String[] args) {
      // Scanner sc = new Scanner(System.in);
//        int c = sc.nextInt();
//        int  F = (c*9/5)+ 32;
//        System.out.println("convert C to F " +F);
       // double a = 0.0;
       // double res = 0.0;
        Scanner sc = new Scanner(System.in);
       double a = sc.nextDouble();
         double res = CtoF((int)a);
        System.out.println("Convert C to F :" + res);
    }
}
/* O/P
i/p 40
o/p convert C to F 104

 */