package StacksBySharddhaKhapara;

// Variable type Sliding Window
public class SlidingWindowTechnique_VariableType {
    public static void main(String[] args) {
        int[] arr = {1,4,20,3,10,5,25,8,33};
        int k =33;
        int start = 0; // start pointer 0th index
        int curr_sum = arr[0];  // initially ham dal denge .. pahle ham man lege ki hamari widow 1 size ki hai
        // yaha ham expension kar rahe hai apne window ka "end" ka use karke
        for(int end = 1; end <= arr.length; end++){  // Window expension

            // greater than(compression)

            while (curr_sum > k && start < end-1){   // end hamesha window me start se ak step hamesha age chalata
                // ha to isliye end-1 kareg
                curr_sum -= arr[start];      // start =0 hai to end-1 tak hi jayega
                start++;
            }
            if(curr_sum == k){   // equal vala case
                // subarray print
                for(int i = start; i< end; i++){
                    System.out.print(arr[i] + " ");
                }
                System.out.println();  // array print karne ke bad new line print karege

            }
            // lesser than (expansion)

            if(end <arr.length) // end, arr.length  tak rahege tabhi expension hoga array ka
            curr_sum += arr[end];     // lesser than rahega tabhi expension karege ham...This is the expension step

        }
    }
}
/* Output:
20 3 10
25 8
33

 */