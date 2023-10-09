package CollectionFramWorkByCollegeWallah;

import java.util.*;

/*  O(n)
Give an array, find the most frequency element in it. If there are multiple elements that appear a maximum
number of times, print any one of them
Sample Input:
n =6;
arr[] = {1,3,2,1,4,1}

Expected Output:
1
 */
public class MaxFreq10 {
    public static void main(String[] args) {
        int arr[] = {1,4,2,3,5,1,4,4,6,4,4,4,6,2,2};
        Map<Integer,Integer>freq = new HashMap<>();
        for(int el : arr){
            if(!freq.containsKey(el)){ // if we are seeing 1st time than this sentence is true
                freq.put(el, 1);
            } else{  // if key exists
                freq.put(el, freq.get(el) +1);
            }
        }
        System.out.println("Frequency Map");
        System.out.println(freq.entrySet());  // [1=2, 2=3, 3=1, 4=6, 5=1, 6=2]
        int mxFreq =0, ansKey = -1;

        for(var e :freq.entrySet()){
            if(e.getValue()> mxFreq){
                mxFreq = e.getValue();
                ansKey = e.getKey();
            }
        }
//        for(var key :freq.keySet()){
//            if(freq.get(key) > mxFreq){
//                mxFreq = freq.get(key);
//                ansKey = key;
//            }
//        }
        System.out.printf("%d has max frequency and it occurs %d times", ansKey, mxFreq);
        //o/p  4 has max frequency and it occurs 6 times
    }

}
