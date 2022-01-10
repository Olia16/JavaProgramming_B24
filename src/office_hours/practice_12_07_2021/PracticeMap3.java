package office_hours.practice_12_07_2021;

import java.util.Map;

public class PracticeMap3 {

    public Map<String, String> mapAB3(Map<String, String> map) {
        String a = map.get("a");
        String b = map.get("b");

        if(a != null ^ b != null){  // ^ - means 'or' but only one of same can be true
            if( a == null){
                map.put("a", map.get("b"));
            }else{
                map.put("b", map.get("a"));
            }
        }
        return map;
    }

}
