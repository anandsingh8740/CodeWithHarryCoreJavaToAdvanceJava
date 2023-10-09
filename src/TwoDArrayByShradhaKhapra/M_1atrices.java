package TwoDArrayByShradhaKhapra;
import java.util.*;
// Q: print largest and smallest element in the matrix
public class M_1atrices {
    // search any key
    public static boolean search(int matrix[][],int key){
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j< matrix[0].length; j++){
               if(matrix[i][j] == key){
                   System.out.println("found at cell (" + i +","+j+")");
                   return true;
            }
        }
    }
        System.out.println("key not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];  // 3 by 3 ka matrix hamne bana diya  total cells hai isme (row*col) = 9
       // int n =3, m=3;
        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // Output
        for(int i=0; i<n; i++){  // Row wise travel karege
            for(int j=0; j<m; j++){ // column wise travel karege
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix, 5);
    }
}
/*
i/p 1 2 3 4 5 6 7 8 9
o/p
1 2 3
4 5 6
7 8 9
found at cell (1,1)
 */
