package prepcodingOfdsaPractice;

import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = n-1;
        int st = 1;
        for(int i =1;i<=n;i++){
            for(int j =1;j<=sp;j++){
                System.out.print("\t");
            }
            for(int j =1;j<=st;j++){
                System.out.print("*\t");
            }
            if(i<=n){
                sp--;
            }
            System.out.println();
        }
    }
}
//logic => if(i+j = n+1)
/*
5
				*
			*
		*
	*
*

 */