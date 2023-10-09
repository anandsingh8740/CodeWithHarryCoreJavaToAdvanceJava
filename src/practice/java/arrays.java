package practice.java;

public class arrays {
    public static void main(String[] args) {
//        int[] arrayName = new int[5];
//        arrayName[0] = 50;
//        arrayName[1] = 60;
//        arrayName[2] = 70;
//        arrayName[3] = 80;
        // Displaying the Array(Naive way)
//        for(int i =0; i<=3 ;i++){
//            System.out.println(arrayName[i]);
//        }
//        int[] marks = {98 ,45,79,99,80};
//        System.out.println(marks.length); //5
//        float[] marks = {98.5f, 45.5f ,79.5f ,99.5f,80.5f};
//        System.out.println(marks[2]);
//        System.out.println(marks.length);
//        //String type array
//        String[]student = {"Harry" ,"Rohan","Shubham", "Lovish"};
//        System.out.println(stu dent.length);
//        int[] marks = {98, 45, 79, 99, 80};
// Imp:- Displaying the Array (for -each loop)
//        System.out.println("Printing using for-each loop ");
//        for(int element : marks){
//            System.out.println(element);
//        }


       // MULTIDIMENTION ARRAY
        int[][] flats ;    // A 2-D Array
        flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
        // Displaying the @-D Array(for loop)
        System.out.println("Printing a 2-D array using for loop");
        for(int i =0;i<flats.length;i++){
            for(int j =0;j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
            //Output
//            Printing a 2-D array using for loop
//            101 102 103
//            201 202 203

        }
    }
}