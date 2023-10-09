package LinkedListByCpllegeWallah;
// OOPS yaha se start hai aur Student vala class me hai oops ka part
public class StudentClass {
//    public static class Student{  // this is basically data type , who we have created himself in this class
//      // Creating a new data type with multiple attribute
//            String name;
//            int rno;
//            double percent;
//        }


//        public static void fun(Student x){
//            System.out.println(x.name);
//            return;
//        }

        public static void change(Student s){
             s.name = "Rohan";
        }
        public static void main(String[] args) {
            //    Student s1 = new Student();
//                s1.name= "raghav";
//                s1.percent=92.1;
//             //  s1.rno =76;   //error show because roll no have maded private
//             //   s1.rno =76;
//             //  System.out.println(s1.getRno());
//                  s1.setRno(87);
//                  System.out.println(s1.getRno());

//            Student s1 = new Student();  // This is declartion not initilization
//            System.out.println(s1.name);
            // yaha hamne ak student ka variable bana liya hai jaise int x karte the
            //means now we have created dabba only
//             s1.name= "Raghav";   //we sets the value ussing dot(.) operator
//             s1.rno=76; // this is initilization
//             s1.percent=92.5; // here we have to set name,rno and percentage value
//            // s1  are object  of these Student class ...
//            System.out.println(s1.name);
//            change(s1);
//            System.out.println(s1.name);


//            // updation
//            s1.name ="Rahul";
//            System.out.println(s1.name);
//            fun(s1);
             Student s1 = new Student("raghav",76,88.6);
              System.out.println(s1.getNumberOfStudents());
//             s1.percent = 88.6;
//             s1.name = "raghav";
//             s1.rno =76;
          //   s1.schoolName ="DPS"; school ko change nahi kar sakte kyoki isme final Student.java me lag chuka hai ab ise use karege to error aajayega
            //System.out.println(s1.schoolName);
          //  System.out.println(s1.numberOfStudents);
//            System.out.println(s1.name);
//            System.out.println(s1.rno);
//            System.out.println(s1.percent);


            Student s2 = new Student("Rahul",67, 98.3);// one line wark as four lines
            System.out.println(s2.getNumberOfStudents());
          //  System.out.println(s2.schoolName);
//            System.out.println(s2.name);
//            System.out.println(s2.rno);
//            System.out.println(s2.percent); // here we did not set the value like s1.rno = 76;
            // and here automatically set by the help of constructor

          //  Student s2 = new Student("Rahul",67,96.3); // ak bar constructor ko declear karne ke bad ham aise kai student ko create kar run kar sakte hai

            Student s3 = new Student("Rahan",99, 91.3);// one line wark as four lines
            System.out.println(s3.getNumberOfStudents());

//            Student.numberOfStudents =100;
          System.out.println(Student.getNumberOfStudents());
    }
}
