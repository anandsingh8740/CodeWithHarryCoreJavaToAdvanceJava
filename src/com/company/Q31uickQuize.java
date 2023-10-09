package com.company;

import java.util.Scanner;
public class Q31uickQuize {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter the value of index");
            int ind = sc.nextInt();
            try {  // try kosis karta hai print karane ki  agar yaha nahi milata to Exception me chala
                // jata hai aur print hojata hai exception vala part

                System.out.println("welcome to video no 82");
                try {
                    System.out.println(marks[ind]);
                    flag = false;   // YAHA FALSE KARNE SE JAB INDEX MIL JAYEGA TO SIDHE LOOP EXIT
                    // HOJAYEGA AUR SAHi value print hojayegi
                }
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this.txt index does not exist");
                    System.out.println("Exception in level 2");
                }
            } catch (Exception e) {
                System.out.println("Exception in level 1");
            }
        }
        System.out.println("Thanks for using this.txt program");
    }
}
//OUTPUT :-
/*
Enter the value of index
8
welcome to video no 82
Sorry this.txt index does not exist
Exception in level 2
Enter the value of index
89
welcome to video no 82
Sorry this.txt index does not exist
Exception in level 2
Enter the value of index
78
welcome to video no 82
Sorry this.txt index does not exist
Exception in level 2
Enter the value of index
3
welcome to video no 82
Sorry this.txt index does not exist
Exception in level 2
Enter the value of index
2
welcome to video no 82
6
Thanks for using this.txt program
 */