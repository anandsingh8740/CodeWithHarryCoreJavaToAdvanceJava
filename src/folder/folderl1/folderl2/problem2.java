/* Chapter -12
Create a package in class with three package levels folder, folderl1, folderl1
 */
package folder.folderl1.folderl2;
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

public class problem2 {
    protected int proInt =4;
    int defInt =41;
    public static void main(String[] args) {
        System.out.println("I am main methods!");
    }
}
