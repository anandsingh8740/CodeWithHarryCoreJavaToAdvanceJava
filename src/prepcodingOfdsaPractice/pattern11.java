package prepcodingOfdsaPractice;

import java.util.Scanner;
public class pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val =1;

        for(int i =1; i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(val +"\t");
                val++;
            }
            System.out.println();
        }
    }
}
/*
5
1
2	3
4	5	6
7	8	9	10
11	12	13	14	15

*/