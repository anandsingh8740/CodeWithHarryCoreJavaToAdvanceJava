package practice.java;

public class arrayPractice {
    public static void main(String[] args) {
        //   float[] arrayName = new float[5];
//      arrayName[0] =  65.0f;
//      arrayName[1] =  55.5f;
//      arrayName[2] =  45.8f;
//      arrayName[3] =  35.9f;
//      arrayName[4] =  75.6f;
//     float sum =0.0f;
//      for(int i =0;i<arrayName.length;i++){
//         sum = sum + arrayName[i];
//    }
//        float sum = arrayName[0] + arrayName[1] +arrayName[2] + arrayName[3] +arrayName[4];
//        //System.out.println(sum);
//        float avg = sum/5;
//        System.out.println(avg);
//        float [] arrayName = {2.3f,0.5f, 0.8f ,98.8f,8.9f};
//        float sum =0;
//        for(int i =0;i< arrayName.length;i++){
//             sum = sum + arrayName[i];
//        }
//        float avg = sum/arrayName.length;
//        System.out.println(avg);
//        int[] arr = {1,2,3,4,5,6,7};
//        int num = 9;
//        boolean isInArray = false;  // by default kah diya ab ise proof karna hai ki ye array hai ki nahi
//        for(int shwe: arr) {  // agar ye number hai to ise sabit karna padega ki hai
//            if (num == shwe) {
//                isInArray =true; // agar value match kare to isInArray ko true kardega
//                break;
//            }
//        }
//        if(isInArray) {
//            System.out.println("The value is present here");
//        } else {
//              System.out.println("Integer is no Present here");
//            }
        // Problem 5
// int []arrayName = {1,2,3,4,5,6,7};
// for(int i =arrayName.length-1;i>= 0;i--){
//     System.out.print(arrayName[i] + " ");
// }
        // Problem 4
        int[][] arrayName = new int[2][3];
/*        arrayName[0][0] =2;
        arrayName[0][1] =3;
        arrayName[0][2] =4;
        arrayName[1][0] =5;
        arrayName[1][1] =6;
        arrayName[1][2] =7;
      */
        int[][] mat1 = {{1, 2, 3},
                        {4, 5, 6}};
        int[][] mat2 = {{2, 6, 13},
                        {3, 7, 1}};
        int [][] result = {{0,0,0},  //isi ke ander sari value ko store karege
                           {0,0,0}};
        for (int i = 0; i < mat1.length; i++) { // row number of time ,ak bar i ko 0 akbar 1 karke chalayege
            //i=0 ko chalege mat1[i].length tak ... iski length mat1[0]length 3 hai
            for (int j = 0; j < mat1[i].length; j++) {  // column number of time
                System.out.format("Setting value for i = %d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
      // Printing the element of a 2-D Array
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(" "); // Print New Line
        /*Setting value for i = 0 and j=0
        Setting value for i = 0 and j=1
        Setting value for i = 0 and j=2
        Setting value for i = 1 and j=0
        Setting value for i = 1 and j=1
        Setting value for i = 1 and j=2
        3 8 16
        7 12 7

         */
        }
    }
}