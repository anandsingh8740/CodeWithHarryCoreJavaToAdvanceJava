package CollectionFramWorkByCollegeWallah;

/* LeetCode 42   O(n)
Question:-  Check whether two string s are anagram of each other. Return true if they are else return
  false.An anagram of a string is another string that contains the same characters, only the order of
  characters can be different. For example , "abcd" and "dabc" are an anagram of each other.
         Input1:
          listen
          silent
          Output1:
          true

          Input 2:
          anagram
          grams
          output2:
          false
 */
import java.util.*;
public class Valid_Anagram11 {

    static HashMap<Character, Integer> makeFreqMap(String str){
        HashMap<Character, Integer> mp = new HashMap<>();
        for(int i =0; i<str.length(); i++){
            Character ch = str.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);  // first time dekh rahe hai to frequency ko 1 rakhege
            }else {
                int currFreq = mp.get(ch);  // pahle se exists karata hai to ak(1) add kar dene
                mp.put(ch, currFreq+1);  // update value
            }
        }
        return mp;
    }
    public boolean isAnagram1(String s , String t){
       if(s.length() != t.length())  return false;
       HashMap<Character, Integer> mp1 = makeFreqMap(s);
       HashMap<Character, Integer> mp2 = makeFreqMap(t);
       return mp1.equals(mp2);

    }

    public boolean isAnagram(String s , String t){
        if(s.length() != t.length())  return false;
        HashMap<Character, Integer> mp = makeFreqMap(s);
        for(int i =0; i<t.length(); i++){  // we will traverse 2nd string here
            Character ch = t.charAt(i);
            if(!mp.containsKey(ch)) return false;

            int currFreq = mp.get(ch);
            mp.put(ch, currFreq-1); // update map .. map ki existing frequency ko ak kam karke dalege
            //
        }

        // All values in mp should be 0 for s and t to be anagrams
        for(Integer i : mp.values()){
            if(i!=0) return false;
        }
        return true;
    }

}
