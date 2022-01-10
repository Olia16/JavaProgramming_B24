package IQ.practice4;

import Practice.FrequencyOfCharacters;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapFrequencyOfCharacters {

     public static void FrequencyTest(String  str ) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (Character each : str.toCharArray()) {
            if (map.containsKey(each)) { // checks if map contains key
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }

        System.out.println(map);
    }

    public static void main(String[] args) {
       FrequencyTest("mama");
    }
}
