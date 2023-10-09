package com.company;
import java.util.Scanner;
public class N30estedTryCatch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of index");
        int ind = sc.nextInt();
        try{  // try kosis karta hai print karane ki  agar yaha nahi milata to Exception me chala
            // jata hai aur print hojata hai exception vala part

            System.out.println("welcome to video no 82");
            try{
                System.out.println(marks[ind]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry this.txt index does not exist");
                System.out.println("Exception in level 2");
            }
        }
        catch(Exception e){
            System.out.println("Exception in level 1");
        }
    }
}
/* OUTPUT : 1
Enter the value of index
2
welcome to video no 82
6
OUTPUT : 2
Enter the value of index
98
welcome to video no 82
Sorry this.txt index does not exist
Exception in level 2
 */