package day54_abstraction.hiding;

public class B extends A {

    public static void staticMethod(){

        System.out.println("B");
    }

    public static void instanceMethodB(){
        //calls closest staticMethod, which is 'B'
        staticMethod();

    }

}
