package TwoDArrayByShradhaKhapra;
import java.util.*;
public class s_2piralMaxtrix {
    public static void printSpiral(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while (startRow <= endRow && startCol <= endCol) {
            // top ...means isper row fixed hoga aue column 0 to (n-1) tak chalega  (j col ke liya) (i row ke liye)
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");  //[startRow] = 0 jo fixted hai top ke liye j change hoga
            }

            // right.........means ham uper se niche ki taraf aarahe hai ..yani ham row ko variable bana rahe hai
            // ab ham starting row +1 se start karege aur ending row tak jayege ; se start karege kyoki uper starting
            // row se ending row tak print hogaya

            // rigth
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " "); // yaha colm fixed hai row variable hai
            }

            // bottom boundary
            for (int j = endCol - 1; j >= startCol; j--) {
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            // left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        printSpiral(matrix);
    }
}
/*
output
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
 */