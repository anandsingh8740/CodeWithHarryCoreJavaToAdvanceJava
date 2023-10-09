package practice.java;

public class C2allingMethod {
    // Ak method ko call karne ke liye hame uska object banana padta hai ...aur object bana kar us
    //object se us method ko call karna padta hai.
    int logic(int x, int y) {  // static mai yana ismethod ko nahi banana chahata hu ...yani ki jo bhi
        //object banega uske apne apne logic ki copy hogi..yani jo bhi obj banega is Class ka
        // uski apni apni copy hoga ......means ham isko share nahi kar sakte hai ..sabka apna apna logic
        //hai ....to ISE CALL KARNE KE LIYE HAME AK OBJECT BANANA PADEGA NICHE HAM BANAYEGE
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = ( x + y ) * 5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        // Method invocation using object creation
        C2allingMethod obj = new C2allingMethod();
        c = obj.logic(a, b);
        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = obj.logic(a1, b1);
        System.out.println(c);  //60
        System.out.println(c1); //3
    }
}