package day53_inheritance;

// cannot have final class as parent , but it can still be a child class
//public class Child extends FinalExamples{}

public class Child {

   // @Override
   //  public static final void method(){}
    //final method cannot be overridden

    //we still can override final method
    public static final void method(int a){

    }

}
class Parent{
    public static final void method(){}

}
