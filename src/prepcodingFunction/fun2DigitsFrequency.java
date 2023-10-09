package prepcodingFunction;

import java.util.Scanner;

public class fun2DigitsFrequency {
    public static int  digitfeq(int n){
        int digit;
        int count =0;
        while(n!=0){
            digit  = n%10;
            n = n/10;
            if(digit == 4){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Digit = digitfeq(n);
        System.out.println(Digit);
    }
}

/*
994543234
3
 */