
class A {
    public int a;

    public int harry() {
        return 4;
    }

    public void meth2() {
        System.out.println("I am method 2 of class A");
    }
}
/* METHOD OVERLOADING:- means ak hi class ke ander do do method hai name usnke same hai lekin
jo parameters hai vo alag alag hai.
*/
/* Method OVERRIDING :- If the child class implements the same method presents in the parents
class again , it is known as method overriding.
means isme access modifire bhi base aur child class me same honi chahiye
=> Redefining method of super class ! (in sub class)

 */
    class B extends A {
    @Override  // jaruri nahi hai but recommanded hai likhana
    public void meth2() {
            /* public void meth2( int a)  to ye overriding nahi hai  .. parameter hoga to override
             nahi hoga tab vo overload hoga */
            System.out.println("I am method 3 of class B");
        }

        public void meth3() {
            System.out.println("I am method 3 of class B");
        }
    }

    public class m5ethodOverriding {
        public static void main(String[] args) {
            A a = new A();
            a.meth2();

            B b = new B();
            b.meth2();  // B ka latest call hoga
        }
    }
    /*
    Output :-
    I am method 2 of class A
    I am method 3 of class B
     */

