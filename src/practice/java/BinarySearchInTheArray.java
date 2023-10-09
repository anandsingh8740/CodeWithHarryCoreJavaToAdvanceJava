package practice.java;

public class BinarySearchInTheArray {
    static  int printBinarySearch(int[] arr , int target){
        int left =0;
        int right = arr.length-1;
        int mid = left + (right - left)/2;

        // print mid
        while (left<=right){
        if(arr[mid] == target){
            return mid;
        }
            // go right
            if(target > arr[mid]){
                left = mid + 1;
            }
            // go Left
            else{
                right = mid -1;
            }
            mid = left + (right - left)/2;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {2,4,6,8,10,12,14,16,18,20};
        int target = 14;
        int getValue = printBinarySearch(arr, target);
        if(getValue == -1){
            System.out.println("Not got target");
        }else{
            System.out.println("Value got at index: " +getValue);
        }
    }
}

// Value got at index: 6