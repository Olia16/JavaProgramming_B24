package IQ.practice4;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharMap {

    public static void main(String[] args) {

        String hello = "helloo";
        Map<String, Integer> answer = new LinkedHashMap<>();

        for (String each : hello.split("")){

            int a = Collections.frequency(Arrays.asList(hello.split("")),each);
            if(a==1){
                answer.put(each,a);
            }
        }
        System.out.println(answer);

    }
}
