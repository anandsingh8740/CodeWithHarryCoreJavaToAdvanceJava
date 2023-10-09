package practice.java;
import java.util.Scanner;
public class GCDand_23_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int org1 = num1;
        int org2 = num2;
        while(num1%num2 != 0) {
            int rem = num1%num2;
            num1 = num2;
            num2 =rem;
        }
        int gcd = num2; // means highest kisse divide hoga value ...i=jise high value se divide hoga vahi gcd hoga
        int lcm = (org1 * org2)/(gcd);
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
/*
36 24
12
72

149 79864
149
79864
*/