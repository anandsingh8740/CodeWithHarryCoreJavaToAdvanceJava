package practice.java;

import java.util.Scanner;

public class conditionalstatementPractices {
    public static void main(String[] args) {

        //      Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your marks in Physics :");
//        int a = sc.nextInt();
//        System.out.println("Enter your marks in Maths :");
//        int b = sc.nextInt();
//        System.out.println("Enter your marks in chemistry :");
//        int c = sc.nextInt();
//        float avg = (a+b+c)/ 3.0f;
//        System.out.println ("My  percentage is   : " +avg);
//
//        if(avg >= 40 && a >=33 && b>= 33 && c>=33 ){
//            System.out.println("You are pass Congratulation :");
//        }else{
//            System.out.println("You are fail please try Again Bro :");
//       }
        // System.out.println("Enter you salary per annum : ");
//         float s1 = sc.nextFloat();
//         if(s1>=250000 && s1 <=500000){
//             float res1 = (s1 * 5)/100;
//             System.out.println("print b/w 2.5 to 5.0 L " + res1);
//         } else if (s1>= 500000 && s1<=1000000) {
//             float res2 = (s1 * 20)/100;
//             System.out.println("print b/w 5 to 10 L " +res2);
//         } else if (s1> 1000000 ) {
//             float res3 = (s1 * 30)/100;
//             System.out.println("print b/w 10 to above L " + res3);
//         } else  {
//             System.out.println("There is no tax given ..you are tax free Person");
//         }
        //  int a = sc.nextInt();
        // ->> Enhance switch case me break ki jarurat nahi padti hai
//      switch (a) {
//          case 1 -> System.out.println("M");
////              System.out.println("M");
////              break;
//          case 2 -> System.out.println("T");
////              System.out.println("T");
////              break;
//          case 3 -> System.out.println("w");
//             // break;
//          case 4 -> System.out.println("Th");
//             // break;
//          case 5 -> System.out.println("Fr");
//             // break;
//          case 6 -> System.out.println("Saturday");
//              //break;
//          case 7 ->System.out.println("Sunday");
//           //break;
//          default -> System.out.println("My name is Anand");
//      }
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        if (str.endsWith(".com")){
//            System.out.println("Commersial website");
//        }else if (str.endsWith(".org")) {
//            System.out.println("Organization website");
//        } else if (str.endsWith(".in")) {
//            System.out.println("Indian Website");
//        }
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a% 4 == 0){
            System.out.println("This is a leap Year");
        }else{
            System.out.println("This is not Leap Year");
        }
    }
}