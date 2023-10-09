package practice.java;

import java.util.Scanner;
public class primeB_WmidNumberNtak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        for (int n = low; n <= high; n++) {
            int count = 0;
            // try to divide n and increase count
            for (int div = 2; div * div <= n; div++)
                if (n % div == 0) {
                    count++;
                    break;
                }
            // try to divide n and increases count
            if (count == 0) { //means divide ak bhi bar nahi hua hai yani count =0 hai ; to prime number print karega
                System.out.println(n);
            }
        }
    }
}
/*
5
15
5
7
11
13
 */