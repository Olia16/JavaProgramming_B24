package office_hours.practice_12_08_2021;

import java.util.HashMap;
import java.util.Map;

public class FrequencyWithMap {

    /*
    * Create a method that will accept a String and print out the frequency of every character in the String (Use maps, format doesn't need to match the output exactly)
Ex:
	Input: "aaapple"
	Output: a = 1
			p = 2
			l = 1
			e = 1
     */

    // { a - 3  }

    public static void frequencyOfChar(String str){
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < str.length(); i++){
            char letter = str.charAt(i);

            if(map.containsKey(letter)){
                // counter by getting the current value of the letter key, it takes that value and adds 1, then it stores as the value back into the map with the same key-letter

                int currentCount = map.get(letter);
                map.put(letter, currentCount + 1);
            } else {
                // will run anytime we check a new character that isn't in our map yet
                map.put(letter, 1);
            }
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        frequencyOfChar("aappleee");
    }

}
