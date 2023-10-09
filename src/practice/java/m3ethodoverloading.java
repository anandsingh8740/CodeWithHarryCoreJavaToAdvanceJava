package practice.java;

public class m3ethodoverloading {
    static void change(int a){
        a =98;
    }
    static void change2(int[] arr){
        arr[0]= 98;
    }
    static void tellJoke(){
        System.out.println("I invented a new word!\n" +"Plagiarism");
     }

    public static void main(String[] args) {
       // tellJoke();

    // Case 1: Changing the Integer
    // int x =45;
    // change(x);
    // System.out.println("The value of x after running change is: " +x); // O/p 45
        // Case 2: Changing the Array
        int [] marks = {52,73,77,89,98,94};
        change2(marks);
        System.out.println("The value of x after running change is: " + marks[0]); //98
    }
}
