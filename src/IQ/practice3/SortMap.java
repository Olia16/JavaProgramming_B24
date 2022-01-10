package IQ.practice3;

import java.util.*;

public class SortMap {
    /*
    3.Sort the map by values
Write a method that can sort the Map by values.
     */
    public static void main(String[] args) {
// create a map and store elements to it
        Map<Integer, Integer> map = new HashMap<>();
        map.put(2, 1020);
        map.put(3, 300);
        map.put(1, 100);
        map.put(5, 500);
        map.forEach((k,v)->System.out.println(k+"="+v));
        System.out.println("After Sorting by value");
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        list.forEach(System.out::println);
    }

}

