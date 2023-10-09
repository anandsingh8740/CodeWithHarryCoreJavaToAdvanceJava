class Cylinder2{
    /*Problem 3:- Use a constructor and repeat (Problem 1)
    jo hamne getter aur setter ki help se work kiya hu use ham ab constructor ki help se banayege
   Important Point :-  The two rules for creating a constructor are: The name of the constructor should
                       be the same as the class. A Java constructor must not have a return type.
                       Output 12
                               9

     */
    private int radius;
    private int height;

    public Cylinder2(int radius, int height) {
        /* isko jam automatically generate kiye hai
         constructor ka name "class name hi rahta hai " but we define a method with name
        as same as Class name
        */
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {     // set  hamesha "void" return karta hai
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    // start problem 2
    public double surfaceArea(){
//        return 2*3.142*radius * radius + 2*3.142*radius*height;  // pi ki jagah Math.PI se accurate value milta hai
        return 2*Math.PI* radius * radius + 2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI*radius*radius* height;
    }
}
// problem 4
class Rectangle{
    private int length;
    private int breath;

       public Rectangle( ) { // it is a constructor // constructor automatically invoke kar leta hai
           this.length = 4;
           this.breath = 5;
       }

       public Rectangle(int length, int breath) {  // constructor add karunga ak aisa constructor add
           // karunga jo ki l , b ko custom  l ,b me set karega
           this.length = length;
           this.breath = breath;
       }

       public int getLength() {
           return length;
       }

       public int getBreath() {
           return breath;
       }
   }
public class Accessexample2 {
    public static void main(String[] args) {
        /*Cylinder2 myCylinder = new Cylinder2(9 ,12); // iske use karne se set ko na use karu tabhi ye work karege
        System.out.println( myCylinder.getHeight());
        System.out.println( myCylinder.getRadius());
        System.out.println( myCylinder.surfaceArea());

        */

        /*4. Overload a constructor used to initialize a rectangle of length 4 and breath5 for using custom
           parameter
         */
        Rectangle r = new Rectangle();
        System.out.println( r.getLength());
        System.out.println( r.getBreath());
        //System.out.println( myCylinder.getHeight());

    }
}
