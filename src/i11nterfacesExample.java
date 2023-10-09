 /* Java Interfaces Example and Default Methods
 Static method ak aisa method hota hai jo ki object se associated nahi hota hai ye assosiated
hota hai ak class se ya ak interface se ,interface se isliye associated hota hai kyoki ham interface
ka refrence bana sakte hai.
*/
interface MyCamera{
    void takeSnap();
    private void greet(){
        System.out.println("Good Morning");
    }
    void recordVidoe();
    //void record4KVidoes(); ye jab likjege to error dega kyo ki hamne niche explain nahi kiya hai
    default void record4KVidoe(){
        /* jab ham force nahi karna chahate hai iski implimentaion
        tab ham  is tarah se add kar sakte hai default method ka ,use karega
        ab ye error nahi dega kyoki default use kiye hai ise yehi per define bhi kar sakte hai
        aisa karne se ye method bhi add hogaya aur hame method ko niche implement karne ki
        jarurat bhi nahi padi.
         */
              System.out.println("Recording in 4k...");
              greet();
    }
}
interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone extends MyCellPhone implements MyWifi,MyCamera{
      public  void takeSnap(){
        System.out.println("Taking snap");
 }
 public void recordVidoe(){
     System.out.println("Taking snap");
 }
 // ham ak bar override kardege to YR(NICHE) vala method kam karega uper vaka nai ...Imp

// public void record4KVidoe(){
//        System.out.println("Taking snap and recording in 4K");
//    }
 public String[] getNetworks(){
     System.out.println("Getting List of Networks");
     String[] networkList = {"Harry" ,"Prashanth", "Anjali5G"};
     return networkList;
 }
 public void connectToNetwork(String network){
          System.out.println("Connecting to " + network);
 }
}
public class i11nterfacesExample {
    public static void main(String[] args) {
      MySmartPhone ms = new MySmartPhone();
      ms.record4KVidoe();
      // ms.greet();  --> Throws an error because ham peivate ko directly access nahi kar sakte hai
     String[] ar = ms.getNetworks(); // ise string me store karna padega
        // use foreach loop
        for(String item : ar){
            System.out.println(item);
        }
    }
}

/*
  OUTPUT

  Recording in 4k...
  Good Morning
  Getting List of Networks
  Harry
  Prashanth
  Anjali5G

 */
