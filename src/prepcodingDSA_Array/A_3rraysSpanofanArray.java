package prepcodingDSA_Array;

import java.util.Scanner;
public class A_3rraysSpanofanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // size ke liye isko likhege
       int [] arr = new int[n]; // size ke liye isko likhege
        // ARRAY ME AISE input LETE HAI
        for(int i =0;i<arr.length;i++){
            arr[i]= sc.nextInt(); // yad rakhna hai ye line
        }
        int max = arr[0];
        int min = arr[0];
        for(int i =0; i<arr.length;i++) { // for(int i =1; i<arr.length;i++) video me aisa likha hai ak age se
            // lenge kyo ki pahle se arr[0] declear hai
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
            int span = max - min;
            System.out.println(span);
     }
    }

/*
6
6
15
30
40
4
11
o/p 36
 */