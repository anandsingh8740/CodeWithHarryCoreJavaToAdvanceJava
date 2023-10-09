package prepcodingString;

public class S_11tringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch ='a';ch<='z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
// abcdefghijklmnopqrstuvwxyz
// O(26)
// O(n^2) string ke liye