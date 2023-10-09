package practice.java;
 /*
 Note :-  invocation karne ke do(2) tarike hai ..1_ ak object bana kar ..agar satatic nahi kiya hai hamne
 to object banana padega (callingMethods vo example hai) 2_ Agar static kar diya hamne ...to ham jo is
 code me hai directly use call kar payege
  */
public class m1ethods {
    static int logic(int x, int y){ // static method hi ham call kar sakte hai No static method ham
        // call nahi kar sakte hai .........kyoki hamko bina object banaye Method call karna hai to ham
        // STATIC KI HELP SE HI BANAYEGE
        int z ;
        if(x>y){
            z= x+y;
        }else{
            z = (x+y)*5;
        }
        x =566; // isko yani x ko change karne per output me koi fark nahi padega
        return  z;
    }
    public static void main(String[] args) {
        int a =5;
        int b=7;
        int c ;
        c =logic(a,b); // a , b copy hai copy ko change karne per uper ke function me koi fark nahi padega
        int a1 =2;
        int b1 =1;
        int c1;
        c1 = logic(a1,b1); // Directly call kar rahe hai bina OBJECT banaye to ham static method
        // hi call kar sakte hai
        System.out.println(c);  //60
        System.out.println(c1); //3
    }
}
