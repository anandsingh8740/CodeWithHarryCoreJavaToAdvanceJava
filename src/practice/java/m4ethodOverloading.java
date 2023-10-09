package practice.java;

public class m4ethodOverloading {
    static void foo(){
        System.out.println("Good Morning bro!");
    }
    static void foo(int a){
        System.out.println("Good morning " +a + "bro!");
    }
    static void foo(int a,int b){
        System.out.println("Good morning " +a + "bro!");
        System.out.println("Good morning " +b + "bro!");
    }
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
        // Method Overloading
        foo();
        foo(3000);
        foo(3000, 4000);
        // Arguments are actual!
    }
}
/*
Good Morning bro!
Good morning 3000bro!
Good morning 3000bro!
Good morning 4000bro!

 */
