package day49_encapsulation;

public class Reviewstatic1 {


    static int i = 6;
    int a = 4;

    public static void main(String[] args) { // main method
        System.out.println("A");
        new Reviewstatic1();
        method1();
    }

    public Reviewstatic1(){  // constructor
        System.out.println("B");
    }

    static {  // static block
        System.out.println("C");
        // System.out.println(a);  cannot use instance variable in static block
    }

    public static void method1(){ // static method
        System.out.println("D");
        System.out.println(i);
        // System.out.println(a); // cannot use instance variable in static method
    }
    public void method2(){ // instance method
        System.out.println(i);
    }
}
