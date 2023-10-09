package prepcodingDSA_Array;

import java.util.Scanner;

public class R_8everseAnArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextByte();
        int [] arr = new int[n];
        for(int i =0; i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int l = arr.length;
        for(int i =0;i<l;i++){
            if(i< l/2){
                int temp = arr[i];
                arr[i] = arr[l-i-1];
                arr[l-i-1] = temp;
            }
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}

/*
5
10 20 30 40 50
o/p 50	40	30	20	10
 */