package day51_inheritance;

public class TestModifier {

    public static void main(String[] args) {

        Modifier obj = new Modifier();
        System.out.println(obj.A);
        System.out.println(obj.B);
        System.out.println(obj.C);
       // System.out.println(obj.D); cannot be accessed, its private var

    }
}
