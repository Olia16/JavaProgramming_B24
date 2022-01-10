package day62_maps;

import java.util.HashMap;

public class MapPractice1 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        //      < Key,   Value >
        // map.add  - > maps don't have "add" method, because they don't inherit Collection interface
        map.put(1, "Leo");
        map.put(2,"Syeda");
        map.put(3,"Saim");
        map.put(3,"Saim");

        System.out.println(map);
        //how to read from a map
        String name = map.get(2);//it is not index, it is key 2
        System.out.println(name);

        map.put(1, "Fuat");
        System.out.println(map);
    }
}
