class Cylinder{
    private int radius;
    private int height;
  // getter and setter ki ninja Technique " Alt + Insert" press after that niche valo ko ctrl ke sath
    // click karna hai ...to apne aap getter and setter generate hojayega
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
public class accessModifireExample {
    public static void main(String[] args) {
        /* Problem 1
        1. Create a class Cylinder and use getters and setters to set its radius and height
        */
        Cylinder myCylinder = new Cylinder();
        myCylinder.setHeight(12);
        int h = myCylinder.getHeight();
        System.out.println(h);
        myCylinder.setRadius(9);
        //int r = myCylinder.getRadius();
        //System.out.println(r);
        System.out.println( myCylinder.getRadius());
        /* 1. Output :- 12
                  9
       */

        /*2. use (problem 1) to calculate surface area and volume of the cylinders

        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());
          Output:-
          1187.5220230569416
          3053.628059289279
          */
        /* Problem 3:- Use a constructor and repeat (Problem 1)

         */
    }
}
