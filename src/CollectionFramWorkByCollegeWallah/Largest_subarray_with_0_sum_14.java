package CollectionFramWorkByCollegeWallah;

/*
Ques: Largest subarray with 0 sum
Given an array arr[] of length N, find the length of the largest subarray with sum equal to 0.
Input1:
n=8
arr[]= {15, -2, 2, -8, 1, 7, 10, 23}
Output1:
5
Input2:
n=3
arr[] = {1, 2, 3}
Output2:
0
 */
import java.util.*;
public class Largest_subarray_with_0_sum_14 {
    int zeroSumLargestSubarray(int[] arr, int n){
        HashMap<Integer, Integer> mp = new HashMap<>();
        // prefixSum, index
        int maxLen =0, prefSum =0;
        mp.put(0,1);
        for(int i =0; i<arr.length; i++){
            prefSum += arr[i];
            if(mp.containsKey(prefSum)){
                maxLen = Math.max(maxLen, i-mp.get(prefSum));  // mp.get(prefSum) isse hame index mil
                // jayega ..tha java vo pichali bar prefix sum..indono ko subtract kar ke 0 length
                // subarray ki length mil jayega
            }else{  // agar map me  prefix sum nahi hai to ham vo prefix sum map ke ander dal denge
                mp.put(prefSum, i);
            }
        }
        return maxLen;
    }
}
