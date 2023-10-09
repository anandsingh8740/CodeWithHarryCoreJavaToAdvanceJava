package practice.java;

public class minimumArrayPrint {
    public static void main(String[] args) {
        int[] arr = {3,4,789,45,1,456,54,34};
        //int min =100;
        int min = Integer.MAX_VALUE; // int min = higher any value
        for(int e :arr){
            if(e< min){
                min =e;
            }
        }
        System.out.println(min);
    }
}
