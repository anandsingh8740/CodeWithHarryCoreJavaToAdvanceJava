package prepcodingString;
 import java.util.*;
public class R_5emovePrimeNumber {
    public static boolean isPrime(int val){
        for(int div =2;div*div <= val; div++){
            if(val % div == 0){
                return false;
            }
        }
        return true;
    }
public static void solution (ArrayList<Integer>a1){
    for(int i =a1.size()-1; i>=0 ; i--){
        int val = a1.get(i);
        if(isPrime(val)==true){
            a1.remove(i);
        }
    }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer>a1 = new ArrayList<>();
        for(int i =0; i<n; i++){
            a1.add(scn.nextInt());
        }
        solution(a1);
        System.out.println(a1);
    }
}
/*
7
8 14 9 17 8 6 42
[14, 9, 8, 6, 42, 8]
17 remove hogaya hai

4
3 12 15 7
[12, 15]
 */