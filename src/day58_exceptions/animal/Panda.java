package day58_exceptions.animal;

public class Panda extends Animal {

    //changing return type in overridden method -> called covariant
    @Override
    public Panda getAnimal(){
        return null;
    }
}
