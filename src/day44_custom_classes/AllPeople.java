package day44_custom_classes;

public class AllPeople {

    public static void main(String[] args) {

        // make Person object
        // made an object/ instance of person class
        Person personOne = new Person();
        personOne.name = "James Bond";
        personOne.age = 20;
        personOne.hairColor = "brown";
        personOne.sex = 'M';
        personOne.isMarried = true;

        // this won't print anything useful
        System.out.println(personOne);

        System.out.println("Name: " + personOne.name);
        System.out.println("Age: " + personOne.age);
        System.out.println("Hair color: " + personOne.hairColor);
        System.out.println("Sex : " + personOne.sex);
        System.out.println("Status : " + (personOne.isMarried ? "yes" : "no"));

        // System.out.println(Person.name); not being used with an object
    }
}
