package CollectionFramWorkByCollegeWallah;

/* LetCode: 205
Ques: Isomorphic Strings
Given two strings s and t, determine if they are isomorphic. Two strings s and t are isomorphic if
the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of
characters. No two characters may map to the same character, but a character may map to itself.
Input1:
aab
xxy
Output1:
true
Input2:
abcdec
viouog
Output2:
false
 */
import java.util.*;
public class Isomorphic_String12 {
    public boolean isIsomorphic(String s, String t){
        HashMap<Character, Character> mp = new HashMap<>();
        HashSet<Character> st = new HashSet<>();
        for(int i =0; i<s.length(); i++){
            Character sCh = s.charAt(i);  // s vake index per koin sa character hai ye nikal lo
            Character tCh = t.charAt(i);    // t vale index per koin sa character hai ye nikal lo

            if(mp.containsKey(tCh)){  // means a ke corresponding do value like x, y rakhi hui hai..jo ki same hona chahiye
               if(mp.get(sCh) != tCh) return false;
            }else if (st.add(tCh)){   // ki ham jo value dalane ja rahe hai..kyo vo already exist nahi karti
                return false;  // exist karti hai to false return karege ..iska mtlb ye hai
                // ak value thi uske hamne kisi aur ke corresponing map kiya tha means a ke corresponding
                //x ko map kiya hua hai phir koi d aya vo bhi x ko map kar raha to do character ak
                // single chige ko map NAHI kar rahe hai
            }else{
                mp.put(sCh, tCh);
                st.add(tCh);
            }
        }
        return true;
    }
}
