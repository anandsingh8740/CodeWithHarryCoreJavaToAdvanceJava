package practice.java;

import java.util.Scanner;
// Given not currect answer
public class BinarySearchInTheArrayUserInput {
    static  int printBinarySearch(int[] arr , int target){
             int left = 0;
             int right = arr.length -1;
          //  int mid = left + (right- left)/2;
             while(left <= right){
                int mid = left + (right- left)/2;

                 if(arr[mid] == target){
                     return mid;
                 }
                 if(arr[mid]< target ){ // go Right side
                     left = mid +1;
                 }
                 else{  // Go Left side
                     right = mid -1;
                 }
                 //  mid = left + (right - left)/2;
             }
             return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
       // int target = sc.nextInt();
        for(int i =0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int BinarySearch = printBinarySearch(arr , target);
        if(BinarySearch == -1){
            System.out.println("Not got target");
        }else{
            System.out.println("Value got at index: " +BinarySearch);
        }

    }
}

/*
5
12 34 21 3 6
21
o/p :-
Value got at index: 2
 */