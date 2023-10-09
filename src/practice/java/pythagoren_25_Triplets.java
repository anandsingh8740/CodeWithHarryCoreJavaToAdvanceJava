package practice.java;

import java.util.Scanner;

public class pythagoren_25_Triplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int p = sc.nextInt();
        int b = sc.nextInt();
        if(h*h == b*b + p*p){
            System.out.println("isPythagoren Triplets");
        }else{
            System.out.println("NotPythagoren Triplets");
        }
    }
}
