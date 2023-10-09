package com.company;
//Custom Exception
class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return "Radius cannot be negative()";
    }
    @Override
    public String getMessage(){
        return "Radius cannot be negative !";
    }
}
public class T33hrowVsThrowsInJava {
    //public static double area(int r){

    public static double area(int r) throws NegativeRadiusException{   // ye sanket denge Throws keyward ki help se
        // kahege ki jakar tum isko handle kar lena
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI*r*r;
        return result;
    }
    public static int divide(int a, int b) throws ArithmeticException { //means ye exception ko throw karta hai
        // Made by Harry
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
        //Shivam - uses divide function created by Harry
        try {
//            int c = divide(6, 0);
//            System.out.println(c);
            double ar = area(6);
            System.out.println(ar);
        } catch (Exception e) {
            System.out.println("Exception");

        }


    }
}