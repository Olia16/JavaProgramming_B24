package day55_abstraction.learn_interface;

public class Spanish implements Language{

    @Override
    public void hi() {
        System.out.println("hola");
    }

    @Override
    public void bye() {
        System.out.println("Adios");
    }
}
