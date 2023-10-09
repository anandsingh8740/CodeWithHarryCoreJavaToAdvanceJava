package practice.java;
import java.util.Scanner;
public class  fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a +" ");
           int  c = a + b;
            a = b;
            b = c;
        }

    }
}
/*
i/p 6
0
1
1
2
3
5
 */