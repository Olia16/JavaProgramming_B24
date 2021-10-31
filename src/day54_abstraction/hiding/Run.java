package day54_abstraction.hiding;

public class Run {
    public static void main(String[] args) {

        A a = new A();
        a.staticMethod();
        a.instanceMethodA();


        B b = new B();
        b.staticMethod();
        b.instanceMethodB();
        b.instanceMethodA();

    }

}
