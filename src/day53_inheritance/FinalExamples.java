package day53_inheritance;

public final class FinalExamples {


    // we cannot change/reassign final variable never
    final int a;
    public static final String PLANET = "Earth";

    public FinalExamples(int a){
        this.a = a;

    }

    public static void main(String[] args) {
        FinalExamples obj = new FinalExamples(5);
        System.out.println(obj.a);
        // obj.a = 10; -. a is final so we cannot change the value
    }

}
