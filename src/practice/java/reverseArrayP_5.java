package practice.java;

public class reverseArrayP_5 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int l = arr.length;
        int n = Math.floorDiv(l,2);
        for(int i =0; i<n;i++){
            int temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for(int element:arr){
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
// Output 6 5 4 3 2 1