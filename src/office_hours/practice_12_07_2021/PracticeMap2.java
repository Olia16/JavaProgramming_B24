package office_hours.practice_12_07_2021;

import java.util.Map;

public class PracticeMap2 {

    public Map<String, String> mapAB2(Map<String, String> map) {

        String a = map.get("a"); // if there is no 'a' key then null is returned
        String b = map.get("b");

        if(a != null && b != null){ // checks if we have the key a and the key b
            if(a.equals(b)){
                map.remove("a");
                map.remove("b");
            }
        }

        return map;

    }
}
