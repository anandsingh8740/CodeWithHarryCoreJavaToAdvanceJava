package practice.java;

public class  maximumArray {

    public static void main(String[] args) {
        int [] arr = {4,5,456,97,8,567,78};
       // int max =0;       //int max = Integer.MIN_VALUE; ye java me inbuild function hai
        int max = Integer.MIN_VALUE;
        for(int e : arr ){ // IMPORTANT **** e ko hi lenge *****
            if(e>max){
                max = e;
            }
        }
        System.out.println(max);   //567
    }
}
