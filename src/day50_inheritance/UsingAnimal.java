package day50_inheritance;

public class UsingAnimal {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.age = 10;

        //animal has access to 3 variables;
        Dog dog = new Dog();
        dog.age = 10;
        dog.hasTail = true;
        //dog has access to 4 variables;
        Lion lion = new Lion();
        lion.numOfClaws = 5;
        lion.roar();
        //lion has access to 5 and 1 method variables;
    }
}
