package practice.java;

public class p_9racticeRecursive {
    // sum(n) = 1+2+3+....+n
    // sum(n) = 1+2+3+....+n-1 +n;
    // sum(n) = sum(n-1) +n
    // sum(3) = 3 + sum(2)
    // sum(3) = 3 +2+ sum(1)
    // sum(3) = 3 +2 +1
    static int sumRec(int n){
        // Base condition
        if(n==1){
            return 1; // yaha per rook jayega iske pahle jo value ayi hai ...uselekar laut jayega
        }
        return n + sumRec(n-1);
    }

    public static void main(String[] args) {
       int c = sumRec(3);
        System.out.println(c);
    }
}
