package day38_methods;

public class sumExample {

    // overloading method allows us to work with multiple data types in the same method/with different parameter types

    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(2.5,5.3));

        String s = "java";
        s.substring(0,1); //j
        s.substring(1);   //ava
    }
    public static int sum(int a, int b){
        return a + b;
    }
    public static double sum(double a, double b){
        return a + b;
    }
}
