package practice.java;
// fibonacci series : 0,1,1,2,3,5,8,13,21,34 // jabtak index nahi kahega tabtak value 1 se satart hogi nahi to 0 se start hogi
public class f_10ibonacciSeries {
    static int fib(int n) {
   /*     // Base condition
        if (n == 1) {   // means 1st position ki value 0 hai
            return 0;
        } else if (n == 2) {
            return 1;
        } */
        if (n == 1 || n == 2) {
            return n-1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
    public static void main(String[] args) {
        int result = fib(5);
        System.out.println(result);
    }
}
