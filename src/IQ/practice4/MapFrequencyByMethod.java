package IQ.practice4;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapFrequencyByMethod {

    public static void main(String[] args) {

        String hello = "mama";
        Map<String, Integer> answer = new LinkedHashMap<>();

        for (String each : hello.split("")){

            int a = Collections.frequency(Arrays.asList(hello.split("")),each);
                answer.put(each,a);
        }
        System.out.println(answer);

    }
}
