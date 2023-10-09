package ArrayListByShradhaKhapra;

import java.util.ArrayList;

public class C_10ontainerWithMostWaterOnComplexity {
    // 2 pointer Approach is question me laga hai
    public static int storeWater(ArrayList<Integer>height){
        int maxWater =0;
        int lp = 0;
        int rp = height.size()-1;  // (n-1)

        while (lp< rp){
            // calculate water area
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp-lp;
            int currwater = ht * width;
             maxWater= Math.max(maxWater, currwater); // maxWater hi maximum value hai

            // update ptr
            if(height.get(lp) < height.get(rp)){ // jo chhota hai vahi upadate hoga "vahi update hoga jo hamari
                // pani ki height ko control karega" smaller height vala pointer
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        // 1, 8, 6, 2, 5, 4, 8, 3, 7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));
    }
}

// output
// 49