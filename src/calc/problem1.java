/* Chapter - 12
Create three classes Calculator , ScCalculator and HybridCalculator and group them into a package
 Means ak Package(calc) me ham log kai sari class ko ak sath group kar sakte hai
 */
package calc;
class Calculator{
    public void calculator(int a , int b){
        System.out.println("Your result is : +  a+b");
    }
}
class ScCalculator{
    public void calculator(int a , int b){
        System.out.println("Your result is : " + Math.sin(a+b));
    }
}
class HyCalculator{
    public void calculator(int a , int b){
        System.out.println("Your result is :" +  a+b);
        System.out.println("Your result is :" + Math.sin(a+b));
    }
}
public class problem1 {
    public static void main(String[] args) {
        System.out.println("I am main method!");
    }
}
