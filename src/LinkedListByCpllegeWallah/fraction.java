package LinkedListByCpllegeWallah;

public class fraction {
    public static Fraction add(Fraction f1, Fraction f2){
        int numerator = f1.num*f2.den + f1.den*f2.num;
        int denominoter = f1.den*f2.den;
        Fraction f3 = new Fraction(numerator,denominoter);
        return f3;
    }
    public static Fraction multiply(Fraction f1, Fraction f2){
        int numerator = f1.num* f2.num;
        int denominoter = f1.den*f2.den;
        Fraction f3= new Fraction(numerator,denominoter);
        return f3;
    }
    public static int gcd(int num, int den){
        int min = Math.min(num,den); // small number se divide kar kar ke bar bar dekhate rahege
        for(int i = min; i>=1; i--){
            if(num%i==0 && den%i==0)return i;   // i hamara hcf rahega
        }
        return min;
    }
    public static class Fraction{
        int num;
        int den;
        public Fraction(int num, int den){  // constructor
            this.num= num; // this  because parameter and above is same then we using this keyword
            this.den= den;
            simplify();
        }
        public void simplify(){
            int hcf = gcd(num,den);
            num/=hcf;
            den/=hcf;
        }

    }
    public static void main(String[] args) {
        Fraction f1 = new Fraction(35,21);
//        f1.num= 3;
//        f1.den= 7;
       System.out.println(f1.num+ "/"+f1.den);
       // f1.simplify();
      //  System.out.println(f1.num+ "/"+f1.den);
        Fraction f2 = new Fraction(7,3);
        System.out.println(f2.num+ "/"+f2.den);
//        Fraction f3 = add(f1,f2);
//        System.out.println(f3.num+ "/"+f3.den);
        Fraction f3 = multiply(f1,f2);
        System.out.println(f3.num+ "/"+f3.den);
    }
}

