package LinkedListByCpllegeWallah;

// yaha ..ye class in different file hai .  but same pakage me hai ..iska use ham is pakage me jitni
// file banayege uske liye ham use kar sakte hai

public class Student {
     // this is basically data type , who we have created himself in this class
      // Creating a new data type with multiple attribute
            String name;
           //private int rno;  // isko is class ke bahar ham kahi per bhi access nahi kar sakte hai
          // private   int rno;
           int rno;
            double percent;
           final String schoolName = "BBPS";   // final use karne se ...ham ab ise kabhi change nahi kar sakte
           // int  numberOfStudents;
         private static int  numberOfStudents;
          public Student(){  // this is  a default constructor

            }
              public Student(String name, int rno, double percent){ // this is a constructor same name as a class name ...but it is a type of function
                this.name = name;
                this.rno = rno;
                this.percent = percent; // this ke use karne se same name hone se error nahi ata hai ..
                  // agar this ka ham use nahi karege to same name me error aajayega
                  numberOfStudents++;
              }
              public static int getNumberOfStudents(){
              return numberOfStudents;
              }

            public int getRno(){  // getter    // not given error .what happen rno id private because when we are use get then no given error rno
                return rno;  //private ki chig ko ham dot(.) operator se ham use nahi kar sakte like access nahi kar sakte ..but same class me ham likh sakte hai

            }
            public void setRno(int rno){ // Setter  //value ko set karna hai to ham ak value lenge like "roll"
                this.rno= rno;

            }
        }

