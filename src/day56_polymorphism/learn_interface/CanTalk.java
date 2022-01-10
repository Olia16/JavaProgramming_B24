package day56_polymorphism.learn_interface;

public interface CanTalk {
    void speak();

    public static void yell(){
        System.out.println("yelling");
    }
    public default void whisper(){
        System.out.println("whispering shh");
    }


}
