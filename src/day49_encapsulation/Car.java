package day49_encapsulation;

public class Car {

    Driver driver; // custom class

    public Car(String name, String license, int age){
        driver = new Driver(name, license, age );
    }

}
//    String driver; // name, license, age
//    String engine; // cylinders, horsePower

class Driver{
    String name;
    String license;
    int age;

    public Driver(String name, String license, int age) {
        this.name = name;
        this.license = license;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", license='" + license + '\'' +
                ", age=" + age +
                '}';
    }
}
