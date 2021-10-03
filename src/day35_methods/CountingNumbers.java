package day35_methods;

public class CountingNumbers {
    // define a method that will count number from 0 to 5
    public static void main(String[] args) {
        countFrom0To5();
        countFrom0ToN(10);
        countFrom0ToN(18);

    }
    public static void countFrom0To5(){
        for(int i = 0; i <= 5; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void countFrom0ToN(int n){
        for(int i = 0; i <= n; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
