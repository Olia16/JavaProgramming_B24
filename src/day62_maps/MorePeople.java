package day62_maps;

import java.util.HashMap;

public class MorePeople {
    public static void main(String[] args) {

        HashMap<Integer, Person >map = new HashMap();
        map.put(01, new Person("Olha"));

        Person person2 = new Person("Elmira");
        person2.age = 21;
        person2.favouriteHobby = "java";
        map.put(02, person2);

        System.out.println(map);
        map.get(01).age = 50;//access person object by get method(key)
        System.out.println(map);
        map.get(01).favouriteHobby = "Softskills";
        System.out.println(map);




    }
}
