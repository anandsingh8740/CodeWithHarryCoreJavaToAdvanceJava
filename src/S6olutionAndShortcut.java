
/*
      Create a class Game, which allows a user to play "Guess the Number" game once.
        Game should have the following methods:
        Constructor to generate the random number
        takeUserInput() to take a user input of number
        isCorrectNumber() to detect whether the number entered by the user is true
        getter and setter for noOfGuesses
        Use properties such as noOfGuesses(int), etc to get this.txt task done!

 */
import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int noOfGusses =0;
    public int inputNumber;
    public int getNoOfGusses() {
        return noOfGusses;
    }
    public void setNoOfGusses(int noOfGusses) {
        this.noOfGusses = noOfGusses;
    }
    Game(){    // void Game()  nahi likhenge kyoki constructor ka koi return type nahi hita hai
        Random rand = new Random();
        this.number = rand.nextInt(100);   // kyoki hame chahiye 0 to 100 tak
    }
    void takeUserInput(){
        System.out.println("Guss the number");
        Scanner sc = new Scanner(System.in);  // input kiye number
        inputNumber =sc.nextInt();
        //return inputNumber;
    }
    boolean isCorrectNumber( ){  // ye currect number batayega
        noOfGusses++;
        if(inputNumber== number){
            System.out.format("Yes you guessed it right, it was %d\n You guessed it in %d attempts",number,noOfGusses);
            return true;
        }else if(inputNumber< number){
            System.out.println("Too low...");
        }
        else if(inputNumber> number){
            System.out.println("Too high...");
        }
        return false;
    }
 }
    public class S6olutionAndShortcut {
      public static void main(String[] args) {
       Game g = new Game();
          boolean b = false;
          while(!b) {
              g.takeUserInput();
              b = g.isCorrectNumber();
              System.out.println(b);
          }
    }
}
/* OUTPUT
Guss the number
45
Too low...
false
Guss the number
23
Too low...
false
Guss the number
15
Too low...
false
Guss the number
10
Too low...
false
Guss the number
3
Too low...
false
Guss the number
6
Too low...
false
Guss the number
7
Too low...
false
Guss the number
8
Too low...
false
Guss the number
9
Too low...
false
Guss the number
10
Too low...
false
Guss the number
50
Too low...
false
Guss the number
60
Too low...
false
Guss the number
80
Too low...
false
Guss the number
90
Too low...
false
Guss the number
99
Too high...
false
Guss the number
98
Too high...
false
Guss the number
95
Too low...
false
Guss the number
97
Too high...
false
Guss the number
96
Yes you guessed it right, it was 96
 You guessed it in 19 attemptstrue

 */