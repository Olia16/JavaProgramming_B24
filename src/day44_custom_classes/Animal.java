package day44_custom_classes;

public class Animal {

    // instance variables
    String species;
    String size;
    int numberOfLegs;
    boolean canFly;
    boolean isMammal;
    double weight;
    double lifeSpan;

    //methods

    // no static -> means these are instance methods
    public void eat(){
        System.out.println(species + " is eating");
    }
    public void sleeping(){
        System.out.println("This "+ size + " animal is sleeping");
    }
}
