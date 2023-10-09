package prepcodingString;

public class S_3tringBuilder {
    public static void main(String[] args) {
        // StringBuilder is mutable(means value change kar sakte hai ham)
        StringBuilder sb = new StringBuilder("hello"); // String sb = "hello"; string ko aise likhate hai ..main diffrence
        System.out.println(sb);    //hello
        char ch = sb.charAt(0);// get  //h // StringBuilder me ham use karsakte hai is function ko string me nahi
        System.out.println(ch);

        sb.setCharAt(0, 'd');// update  // ye bhi function String me nahi rahta hai
        System.out.println(sb); // dello

        sb.insert(2 , 'y'); //insert // means 2nd position per 'y' dal do
        System.out.println(sb);   // deyllo

        sb.deleteCharAt(2); //remove // means 2nd position ko delete kar do
        System.out.println(sb);   // dello

        sb.append('g');   // last me add karne ke liye use karte hai
        System.out.println(sb); // dellog

        System.out.println(sb.length());  // 6
    }
}
