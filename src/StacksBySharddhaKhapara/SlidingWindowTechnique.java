package StacksBySharddhaKhapara;

//FIXED SIZE WINDOW
public class SlidingWindowTechnique {
    public static void main(String[] args) {
        int[] arr = {100 , 200, 300 , 400};
        int k =2;

        int curr_sum =0;
        // initial window sum ... 0 , 1 index ka sum hai ye
        int max_sum =0;
        for(int i =0;i<=k-1;i++){
            curr_sum +=arr[i];
        }
        max_sum = curr_sum;   // starting me maximum sum current sum ke equal hoga  brotforce me dekh lo
        // ye 2 se start hoga aur arr.length tak jayega aur compair karega curr , max ke bich me
        // yaha starting me curr_sum 100+200 =300 hoga
        for(int i =k;i<arr.length;i++){
            curr_sum += arr[i] - arr[i-k]; // 300 +300 -100 = 500 vaise bhi dekhe to 20+4 = 24 hoga
            max_sum = Math.max(curr_sum , max_sum); // hamne previous max sum ka max leliye hai
        }
        System.out.println(max_sum);
    }
}
// output: 700