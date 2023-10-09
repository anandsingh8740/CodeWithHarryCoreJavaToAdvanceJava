package ArrayTwoPointerApproach;

import java.util.Scanner;

public class Two_Pointer_Approach_1 {
    static void printArray(int[] arr){
        int n = arr.length;
        for(int i =0; i<n; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortArrayByParity(int[] arr){
        int n = arr.length;

        int left =0,right = n-1;
        while (left <right){
            if(arr[left] % 2 == 1 && arr[right] % 2 == 0){
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left]%2 ==0){
                left++;
            }
            if(arr[right] % 2 ==1){
                right--;
            }
            /*
            Enter 6 elements
            1 2 3 4 5 6
            Original array
            1 2 3 4 5 6
            Sorted array:
            6 2 4 3 5 1
 */
        }
    }
    static void sortZerosAndOnes(int[] arr) {
        int n = arr.length;

        int left = 0, right = n - 1;
        while (left < right) {
            if (arr[left] == 1 && arr[right] ==0){
                swap(arr,left, right);
                left++;
                right--;
            }

            if(arr[left] ==0){
                left++;
            }

            if(arr[right] == 1){
                right--;
            }
        }
    }
//    static void sortZerosAndOnes(int[] arr){
//        int n = arr.length;
//        int zeroes =0;
//        // count number of zeroes
//        for(int i =0; i<n; i++){
//            if(arr[i] == 0){
//                zeroes++;
//            }
//        }
//
//        // 0 to zeroes-1 : 0, zeroes to n-1 : 1
//        for(int i=0; i<n; i++){
//            if(i<zeroes){
//                arr[i] =0;
//            }else{
//                arr[i] =1;
//            }
//        }
//    }

    // reverse code
    static void reverse (int[] arr){
        int i =0,j=arr.length-1;
        while (i<j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    static int[] sortSquares(int[] arr){
        int n = arr.length;
        int left = 0, right = n-1;
        int[] ans = new int[n];  // ak hame ans chahiye jo hame fill karna hai
       // int k =0; // ak variable chahiye jo ki is arr per traverse karke fill kare
        int k =n-1;
        while (left <= right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k--] = arr[left] * arr[left];
                left++;
            }else{
                ans[k--] = arr[right] * arr[right];   // K++ when we will use reverse function
                right--;
            }
        }
       // reverse(ans);
        return ans;
        /*
        Enter array size 5
        Enter 5 elements
        -10 -5 1 2 3
        Original array
        -10 -5 1 2 3
        Sorted array:
        1 4 9 25 100
        */
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " +n + " elements");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array");
        printArray(arr);
       int[] ans = sortSquares(arr);
      //  sortArrayByParity(arr);
     //   sortZerosAndOnes(arr);
        System.out.println("Sorted array: ");
     //   printArray(arr);
     //   reverse(ans);
        printArray(ans);

    }
}
