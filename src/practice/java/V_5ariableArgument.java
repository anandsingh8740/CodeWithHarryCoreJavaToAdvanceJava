package practice.java;

public class V_5ariableArgument {
//    static int sum(int a , int b){
//        return a+b;
//    }
//    static int sum(int a , int b,int c){
//        return a+b+c;
//    }
//    static int sum(int a , int b,int c,int d){
//        return a+b+c+d;
//    }
    //Varargs me ham ak function ko ak se jada argument de sakte hai
    static int sum(int ...arr){     // ye (...) triple dot ye kahega ki mujhe jitne bhi argument mile unko ak
      /* Important:- static int sum(int x,int ...arr){    yaha per ak argument compulsuri hai pass karna nahi to
          error ayega  ..niche ke Sum() me
        */
        // array me pack  kar dedo
        // Available as int [] arr
         int result =0;
         for(int a:arr) {                             // far a in arr ..isko aise padhte hai
             result += a;
         }
         return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Varargs Tutorial");
        System.out.println("The sum of Nothing is: " +sum()); // kuch nahi pass karne per empty array pass hoga =0;
        System.out.println("The sum of 4 and 5 is: " +sum(4,5));
        System.out.println("The sum of 4,3 and 5 is: " +sum(4,3,5));
        System.out.println("The sum of 4,3 and 5 is: " +sum(1,2, 4,3,5));
    }
}
