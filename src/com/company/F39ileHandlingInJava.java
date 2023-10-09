package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.IOException;

public class F39ileHandlingInJava {
    public static void main(String[] args) {
     /* File genertaion vala hai ye like cwh111file.txt
        // Code to create new file
        //made file object
        File myFile = new File("cwh111file.txt");
        try {
            //cwh111file ban gayi hai project me dekhane per
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this.txt file ");
            e.printStackTrace();
        }
       */
       /*
        //Code to write to a file
        try {
            FileWriter fileWriter = new FileWriter("cwh111file.txt");
            fileWriter.write("This is oue first file from this.txt java course\n Okay now bye");
            fileWriter.close();  // koi file open kiye hai to use band karna bhi jaruri hai na isliye close() ka use karege
        } catch (IOException e) {
            e.printStackTrace();
        }
      */

        /*
        // Reading a file
        // first made a file object
        File myFile = new File("cwh111file.txt");
        try {
            Scanner sc = new Scanner(myFile); //(myFile yaha per object hai)
            while(sc.hasNextLine()){ //means isme New line hai to ham isko string me store kar denge
                String line =sc.nextLine();
                System.out.println(line);
            }
            sc.close();   //means isse ye hoga ki jo reading keliye file open kar rakhi hai vo close hojayegi
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e); mera complier me press karne per show ho raha hai but
            e.printStackTrace();
        }

         */
        // Deleting a file
        File myFile = new File("cwh111file.txt");
        if(myFile.delete()){
            System.out.println("I have deleted: " + myFile.getName());
        }
        else{
            System.out.println("Some problem occurred while deleting the file");
        }
    }
}
