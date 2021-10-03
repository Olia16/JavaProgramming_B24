package day44_custom_classes;

public class Wild {
    public static void main(String[] args) {
        Animal tiger = new Animal();
        tiger.species = "Tiger";
        tiger.size = "Large";
        tiger.numberOfLegs = 4;

        // Animal.eat(); cannot call eat method from Animal class directly
        tiger.eat();
        tiger.sleeping(); // to call eat method, we have to use it from an object

        new Animal().eat(); // made an object without reference, so it uses default value

        Animal panda = new Animal();
        panda.eat();
        panda.species = "Panda";
        panda.eat();
    }

}
