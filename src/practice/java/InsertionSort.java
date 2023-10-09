package practice.java;

public class InsertionSort {
    static void  printInsetionSort(int[] arr){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int [] arr = {7,8,3,1,2};
        // insertionSort
        for(int i =1; i<arr.length;i++){  // unsorted element
            int current = arr[i];  // unsorted element
            int j = i-1; // isko ham sorting ham kar chalate hai
            while (j>=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--; // samjhana hai
            }
            // placement
            arr[j+1] = current;
        }
        printInsetionSort(arr);
    }
}
// 1 2 3 7 8