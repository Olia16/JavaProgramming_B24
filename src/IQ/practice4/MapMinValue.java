package IQ.practice4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;

public class MapMinValue {

    public static int minimumValue(Map<String, Integer> map) {
        TreeSet<Integer> set = new TreeSet<>(map.values());
        return set.first();
    }


    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Java",1);
        map.put("is",5);
        map.put("fun",9);

        System.out.println(minimumValue(map));
    }

}
