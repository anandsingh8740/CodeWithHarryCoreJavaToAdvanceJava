package TwoDArrayByShradhaKhapra;
import java.util.*;
public class d_3iagonalSum {
    public static int diagonalSum(int matrix[][]){   // O(n^2)
        int sum =0;

//        for(int i=0; i<matrix.length; i++){
//            for (int j =0; j<matrix[0].length; j++){
//                if(i==j){   // primary diagonal me i==j hoga usi ko hame add karna hai
//                    sum+= matrix[i][j];
//                } else if (i+j == matrix.length-1) {  // secondry diagonal (n-1)=(i+j)
//                    sum +=matrix[i][j];
//                }
//            }
//        }

        for(int i=0; i< matrix.length; i++){
            //pd

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
