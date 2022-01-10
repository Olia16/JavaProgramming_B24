package day56_polymorphism.animal;

public class Reptile extends Animal{
    @Override
    public void eat() {
        System.out.println("Reptile is eating -> from Reptile");

    }
}
