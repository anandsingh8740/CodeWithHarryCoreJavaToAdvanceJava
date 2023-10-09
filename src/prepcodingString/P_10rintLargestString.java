package prepcodingString;

public class P_10rintLargestString {
    public static void main(String[] args) {
        String fruits[] = {"apple","mango","banana"}; // string Array

        String largest = fruits[0];
        for(int i =1; i<fruits.length; i++){
            if(largest.compareTo(fruits[i])<0){  // agar largest chhota hai to assign kar dege bada vala
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
// mango