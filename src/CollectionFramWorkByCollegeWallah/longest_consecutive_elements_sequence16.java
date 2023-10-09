package CollectionFramWorkByCollegeWallah;

import java.util.HashSet;

/*
Ques:

Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
Input 1
n =6
nums = [100,4,200,1,3,2]
Output 1:
4
Input 2:
 n=10
nums = [0,3,7,2,5,8,4,6,0,1]
Output 2:
9
 */
public class longest_consecutive_elements_sequence16 {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> st = new HashSet<>(); // sare jo numbers hai "nums" ke ander unsabko hame Hashset me dalana hai
        for (int num : nums) st.add(num);
        int maxStreak =0;

        // ab ham Traverse karege Set per Naki array per
        for (int num : st) {
            if (!st.contains(num - 1)) {  // num is starting point of a sequence
                int currNum = num; // 1
                int currStreak = 1;   // length of current consecutive sequence
                while (st.contains(currNum +1)){  // hame ye tab tak karna hai jab tak (currNum +1) set ke
                    // ander hai kyoki 1 mil gaya to 2 dudha , 2 milgaya to 3 dudha ....isliye ham ye loop lagaye hai
                    currStreak++;
                    currNum++; // 2 ...

                }
                maxStreak = Math.max(maxStreak, currStreak); // yaha ham upadet kar denge value ko
                // streak me ham length maintain kar rahe hai
            }
        }
        return maxStreak;
    }
}