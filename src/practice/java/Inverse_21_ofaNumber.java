package practice.java;

import java.util.Scanner;
public class Inverse_21_ofaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //21453 (kul milakar 21453 position hai isi jagah value dali jayegi 2^5 1^4 4^3 5^2 3^1)ka inverse
        // means 3 re position per 1 ,5ve pos 2,4th pos 3,1st pos per 4,2nd per 5..hoga counting piche se hogi
        int inv =0;
        int op =1;
        while(n!=0){
            int od = n%10;
            int id = op;
            int ip = od;
            // make change to inv using ip and id
            inv = inv +   id*(int)Math.pow(10, ip- 1);
            n = n/10;
            op++;
        }
        System.out.println(inv);
    }
}
/* output

21453
23154
*/