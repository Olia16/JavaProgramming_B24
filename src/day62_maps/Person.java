package day62_maps;

public class Person {
    String name;
    int age;
    String favouriteHobby;

    public Person(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", favouriteHobby='" + favouriteHobby + '\'' +
                '}';
    }
}
