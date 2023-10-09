
// ham inharits kar sakte hai ak interface se dusare interface se
//Remember this.txt point - ak interface ko extend karke ham dusari class nahi bana sakte
interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{ // ye ak valid way to extend an interface hai
    // means ham log inharitance is tarah se use kar sakte hai
    // agar interface ko implement karege to ham math1() , math2() ki difinition hame likhni padegi
    // ham interface bana sakte hai dusare interface ki help se
    void meth3();
    void meth4();
}
class MySampleClass implements childSampleInterface{
    public void meth1(){  // isko isliye declear karege kyoki ye inharits hai class me nahi karege
        // to erroe ayega
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}
public class i12nheritanceInInterfaces {
    public static void main(String[] args) {
    MySampleClass obj = new MySampleClass();
    obj.meth1();
    obj.meth2();
    obj.meth3();
    obj.meth4();
    }
}
/* OUTPUT
  meth1
  meth2
  meth3
  meth4


 */
