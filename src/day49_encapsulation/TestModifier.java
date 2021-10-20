package day49_encapsulation;

public class TestModifier {

    public static void main(String[] args) {
        AccessModifier object = new AccessModifier();
        object.a = 1;
        object.b = 2;
      //  object.c = 3; c- is private, cannot access it outside the class;
        Paper paper = new Paper();
        paper.cut();
        paper.fold();
        paper.write();



    }
}
