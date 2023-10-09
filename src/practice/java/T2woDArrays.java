package practice.java;

import java.util.Scanner;

public class T2woDArrays {
    public static void main(String[] args) {
        int [][] a = new int[2][2];
        int [][] b = new int[2][2];
        int [][] c = new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first matrix ");
        for(int i =0;i<2;i++){
            for(int j =0;j<2;j++){
                a[i][j]  = sc.nextInt();
            }
        }
        System.out.println("Enter second matrix");
        for(int i =0;i<2;i++){
            for(int j =0;j<2;j++){
                b[i][j]  = sc.nextInt();
            }
        }
        System.out.println("print 2D matrix ");
        for (int i =0;i<2;i++){
            for(int j=0; j<2;j++){
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println( );
        }
    }
}
/*
Enter first matrix
10 20 30 40
Enter second matrix
50 60 70 80
print 2D matrix
60 80
100 120

 */