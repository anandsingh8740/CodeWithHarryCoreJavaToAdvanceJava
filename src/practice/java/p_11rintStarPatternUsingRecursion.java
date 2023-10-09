package practice.java;

public class p_11rintStarPatternUsingRecursion {
    static void pattern1_rec(int n){
        if(n>0){
            pattern1_rec(n-1);
            for(int i =0; i<n; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // pattern1_rec(3)
    // pattern_rec(2) + 3 times start and new line
    // pattern_rec(2) + 2 times start and new line + 3 times start and new line
    // pattern_rec(2) + 1 times start and new line + 2 times start and new line + 3 times start and new line
    public static void main(String[] args) {
        int n =9 ;
        pattern1_rec(n);
    }
}
/* Output
 *
 **
 ***
 ****
 *****
 ******
 *******
 ********
 *********
 */