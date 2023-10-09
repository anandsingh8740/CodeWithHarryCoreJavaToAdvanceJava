package practice.java;
import java.util.*;
// Arrays.sort(arrname) is a direct shoeting formula
public class sortArray {
    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 8, 2, 98, 3};
        System.out.println(" print sorting arrays :");
        for(int e : arr){
            System.out.print(e + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.println("Print array in assending order ");
        for(int e : arr){
            System.out.print(e +" ");
        }
    }
}
//Output
/*
 print sorting arrays :
5 6 1 8 2 98 3
Print array in assending order
1 2 3 5 6 8 98
 */