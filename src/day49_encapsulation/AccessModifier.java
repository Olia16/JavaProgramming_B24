package day49_encapsulation;

public class AccessModifier {

    public int a;
    int b;
    private int c; // you access only in the same class - it is private

    public static void main(String[] args) {
        AccessModifier object = new AccessModifier();
        object.a = 1;
        object.b = 2;
        object.c = 3;


    }

}
