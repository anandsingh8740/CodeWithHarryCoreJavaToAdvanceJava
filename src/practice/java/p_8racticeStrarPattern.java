package practice.java;

public class p_8racticeStrarPattern {
    static void star(int n){
//        for(int i =1; i<=4;i++){
//            for(int j =1;j<=i;j++){
//                System.out.print("*");
//            }
        for(int i =4; i>=1;i--){
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a=5;
        star(a);
    }
}
