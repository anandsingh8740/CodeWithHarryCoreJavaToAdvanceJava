package com.company;
  //specific  exception ko ham try catch ki help se hi Handle kar sakte hai
/* Q:- mai puch raha hu user se batav ki in teeno me se marks se koin se marks ko hamlogo ko divide
l=karna hai aur kis number se divide karna hai ...agar ham galat index supply kar diye to arry index
 out of bound  execption show karega
*/
import java.util.Scanner;
public class H29andlingSpecificExceptions {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to divide the value with");
        int number = sc.nextInt();
        try {
            System.out.println("The value at array index entered is :" + marks[ind]);
            System.out.println("The value of array-value/number is : " + marks[ind] / number);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occured!");
            System.out.println(e);  // isse jo exception hai use dikhaya ja sakta hai

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occured!");
            System.out.println(e);

        } catch (Exception e) {
            System.out.println("Some other exception occured!");
            System.out.println(e);
        }
    }
}
// OUTPUT
/*
Enter the array index
88
Enter the number you want to divide the value with
0
ArrayIndexOutOfBoundsException occured!
java.lang.ArrayIndexOutOfBoundsException: Index 88 out of bounds for length 3
 */

/*
Enter the array index
1
Enter the number you want to divide the value with
0
The value at array index entered is :56
ArithmeticException occured!
java.lang.ArithmeticException: / by zero

 */