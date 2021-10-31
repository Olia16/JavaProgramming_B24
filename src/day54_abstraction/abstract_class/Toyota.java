package day54_abstraction.abstract_class;

public class Toyota extends Car{

    @Override
    public void start() {
        System.out.println("Insert Key");
        System.out.println("Turn Key");
    }
}
