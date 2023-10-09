package TwoDArrayByShradhaKhapra;
import java.util.*;
public class d_4iagonalSumTimeComplexityOn {
    public static int diagonalSum(int matrix[][]) {   // O(n)
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            //pd
            sum += matrix[i][i]; // means[1,1  2,2,.. ke jagah ki value ko ham add kar lege]
            // sd
            if (i != matrix.length - 1 - i)   // j = n-1-i;   // n = matrix.length-1 // mens yaha i j ke equal
                // nahi hai ham overlapping se bach payege
                sum += matrix[i][matrix.length - i - 1];
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        System.out.println((diagonalSum(matrix)));  // Output 68 (34+34)
    }
}

