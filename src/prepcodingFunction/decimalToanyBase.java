package prepcodingFunction;

import java.util.Scanner;
public class decimalToanyBase {
    // public static int dec(int )
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }
    public static int getValueInBase(int n, int b) {
        int rv = 0;
        int p = 1; // 10 ko pawer 0 isEqual to 1 hota hai to niche isse age ka hota chala jayega like 100,1000
        while (n > 0) {
            int dig = n % b;
            n = n / b;
            rv += dig * p;  // purani value me add karege
            p = p * 10;
        }
        return rv;
    }
}
/*
63
8
77

57
2
111001

634
8
1172
 */
