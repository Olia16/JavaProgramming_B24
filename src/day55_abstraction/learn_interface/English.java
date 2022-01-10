package day55_abstraction.learn_interface;

public class English implements Language{
    @Override
    public void hi() {
        System.out.println("hello");
    }

    @Override
    public void bye() {
        System.out.println("good bye");
    }
}
