package ArrayListByShradhaKhapra;
import java.util.ArrayList;
public class C_9ontainerWithMostWater {
    public static int storeWater(ArrayList<Integer>height){
        int maxWater =0;   // 0 yani ager hight ke ander ak hi line hai tab to ham kisi ko container bana hi nahi payege
        // kyoki single line ka koi container banata hi nahi hai.. to 2 boundry chahiye isliye us time per maxWater ko
        // ham zero lelege
        // globle variable hai isi se compair karke maximum store water find out karege

        // brute force - O(n^2)
        for(int i =0; i<height.size();i++){
            for(int j=i+1; j< height.size();j++){
                int ht = Math.min(height.get(i), height.get(j));
                //means ith index per jo height store hai ye Line1 ..ki height hai aur jth index per jo hai vo line 2 ki height hai
                int width = j-i;
                int currWater = ht*width; // ye abhi current ki hai
                maxWater= Math.max(maxWater,currWater); // dono me jo bada hoga vo maxWater me store hojayega
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

// Output
// 49  maximum area