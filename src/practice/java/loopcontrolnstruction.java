package practice.java;
import java.util.Scanner;

public class loopcontrolnstruction {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 4; i>0 ; i--){  ////mujhe star nahi print karna hai hame star i times print karna hai
//            for (int j =0 ; j<i; j++) {  // star i times print karne ke liye rrrrrr
//                System.out.print("*");
//            }
//            System.out.println();
//    }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //       int sum =0;
//        for(int i =2 ; i<=n ; i+=2){
//            sum = sum +i;
//        }
//        int i =0 ;
//        while(i<=n) {
//            sum = sum + i;
//            i = i + 2;
//        }
//        System.out.println("sum of even number " +sum);
        // int i =1;
        // int mul;
//        while(i<=10){
//            mul = n*i;
//            System.out.println( mul);
//            i++;
//        }
//        for(int i =1;i<=10;i++){
//            mul = n*i;
//            System.out.println(mul);
//        }
        // Reverse multiplication
//        for(int i =10;i>=1;i--){
//            mul = n*i;
//            System.out.println(mul);
//        }
//      int fact =1;
//      for(int i =1;i<=n ;i++){
//          fact = fact *i;
//      }
//        System.out.println(fact);
//        int i=1;
//        while(i<=n){
//            fact = fact*i;
//            i++;
//        }
//        System.out.println(fact);
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += n * i;

        }
        System.out.println(sum);
    }
}
