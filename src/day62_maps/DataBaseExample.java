package day62_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBaseExample {

    public static void main(String[] args) {


        HashMap<String, String> person1 = new HashMap<>();
        person1.put("FIRST_NAME", "James");
        person1.put("LAST_NAME", "Bond");
        person1.put("AGE", "40");
        System.out.println(person1);

        ArrayList<Map<String, String>> allPeople = new ArrayList<>();
        allPeople.add(person1);

        //I want to know the first name
        System.out.println(allPeople.get(0).get("FIRST_NAME"));
    }
}
