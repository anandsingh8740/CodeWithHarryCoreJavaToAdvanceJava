
/*
  Create a class Circle and use inheritance to create another class Cylinder from it.
 */
  class Circle{
      public int radius;
      Circle(int r){ // ye radius ki value ko set karta hai chahe jo value uski di jaye
          System.out.println("I am circle parameterized constructor");
          this.radius =r;   // yaha per ham radius set karege
      }
      public double area(){   // function/method
          return Math.PI*this.radius*this.radius;
      }
}
  class Cylinder1 extends Circle{
      public int height;
      Cylinder1(int r , int h){
          super(r); // ye pahle parent class ke parametized constructor ko run karega uske pad
          //sub class ke parametrized constructor ko run karega
          System.out.println("I am cylinder1 parameterized constructor");
          this.height = h; // height ko set kar do h ke equal
      }
      public double volume(){
          return Math.PI*this.radius*this.radius*this.height;
      }
  }
public class e_8xercise {
    public static void main(String[] args) {
        //Circle objC = new Circle(12);  // I am circle parameterized constructor
      Cylinder1 obj = new Cylinder1(12,4);
    }
}
