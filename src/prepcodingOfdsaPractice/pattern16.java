package prepcodingOfdsaPractice;

import java.util.Scanner;

public class pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = ( 2 * n - 3);
        int st =1;
        for (int i = 1; i <= n; i++) {
            int val =1;
            for (int j = 1; j <= st; j++) {
                System.out.print(val + "\t");
                val++;
            }
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
           if(i==n){
               st--;
               val--;
           }
            for(int j =1; j<=st;j++) {
                val--;
                System.out.print(val + "\t");
            }
            st++;
            sp-=2;
            System.out.println();
        }

    }
}
/*
4

1						1
1	2				2	1
1	2	3		3	2	1
1	2	3	4	3	2	1

 */