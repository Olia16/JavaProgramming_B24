package day56_polymorphism.learn_interface;

public class Speech implements CanTalk{

    @Override
    public void speak(){
        System.out.println("Speaking");
    }
}

class Runner{
    public static void main(String[] args) {
        Speech speech = new Speech();
        speech.speak();
        speech.whisper();
        CanTalk.yell();
    }
}
