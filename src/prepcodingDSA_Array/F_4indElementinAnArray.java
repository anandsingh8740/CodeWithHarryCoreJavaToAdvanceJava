package prepcodingDSA_Array;

import java.util.Scanner;

public class F_4indElementinAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        // int d = sc.nextInt();
        for(int i =0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        int index =-1;
        for(int i =0; i< arr.length;i++){
            if(arr[i]== d){
                 index = i;
                 break;
            }
        }
        System.out.println(index);
        }
    }

/*
6
15
30
40
4
11
9
40
o/p 2
 */

/*
6
15
30
41
4
11
45
d= 56
o/p -1
 */