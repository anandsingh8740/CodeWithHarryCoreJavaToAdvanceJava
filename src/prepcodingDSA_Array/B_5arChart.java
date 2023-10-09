package prepcodingDSA_Array;

import java.util.Scanner;
public class B_5arChart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i =1; i<arr.length;i++){
            if(arr[i]>max){
              max = arr[i];
            }
        }
        for(int floor = max; floor>=1;floor--) {   // top floor ke liye hai..uper se dekhege heigth
            for (int i = 0; i < arr.length; i++) {  // bricks ke liye hai ye // har bulding ko analize kiya jayega
                if (arr[i] >= floor) { // means height ke uper ya barabar jitni value hongi vo "*" print hoga
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
/*
i/p
5
3
6
1
2
2
 */

/*
o/p
 *
 *
 *
 *	*
 *	*		*	*
 *	*	*	*	*
 */