
class Phone{
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void on() {
        System.out.println("Turning on Phone... ");
    }
}
class SmartPhone extends Phone{
    public void  music(){
        System.out.println("Playing music...");
    }
    public void on() {
        System.out.println("Turning on SmartPhone... ");
    }
}
public class d6ynamicMethoddispath {
    public static void main(String[] args) {
        /*
        Phone obj = new Phone();  // Object run time per banega
        SmartPhone smobj = new SmartPhone();  // Allowed
         obj.name();   // My name is Java
        */
        /* Most Importan => Dynamic method dispath :- yahi ki jo method hai vo run time per
         diside hota hai ki koin sa Run hona hai... Kyoki hamara object run time per banata hai
           niche vala line me show kiya gaya hai
           */
        Phone obj = new SmartPhone();  // Yes it is allowed
        // superclass obj = new subclass() => ALLOWED tabhi kar sakte ha
        // super class ka reference(obj) aur subclass ka Object allowed
        //SmartPhone obj2 = new Phone();  // aisa nahi kar sakte Not allowed
        obj.showTime(); // Good Morning
        obj.on();
        //obj.music(); Not Allowed
        /* "on" ko hamne override kiya hai
            object ka RUN hoga yahi ki jo OBJECT hai uska run hoga REFERENCE ka nahi run hoga method
            isme object SmartPhone hai aur reference on Phone hai

            jaha new likha hai mtlb run time per object banata hai
         */
    }
}
//    OUTPUT:-
//            Time is 8 am
//            Turning on SmartPhone...
