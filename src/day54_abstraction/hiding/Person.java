package day54_abstraction.hiding;

public class Person {

    String name = "James Bond";

}
class Baby extends Person{
    //we cannot override variable, but we can hide -> by creating another name var in the sub class,
    //which hides parent's variable
    String name = "Agent Smith";

}
class Runner{
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);
        Baby baby = new Baby();
        System.out.println(baby.name);
    }
}
