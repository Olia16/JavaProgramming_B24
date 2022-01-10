package day60_collections;

import java.util.*;

public class Convert {
    public static void main(String[] args) {

        ArrayList<Integer>nums = new ArrayList<>(Arrays.asList(4,5,2,4,5,6,2,6,1,6,3,8,7));
        //remove all duplicate values
        //cannot make an object of set(interface), but we can use HashSet class that implements set interface
        Set<Integer> unique = new HashSet<>(nums);
        System.out.println(unique);


        Set<String> list = new HashSet<>();
        list.add(null);
        list.add("hello");
        list.add("$4.0");
        list.add("100");
        list.add("hello");
        list.add("%");
        System.out.println("Original: " + list);
        //converting to arraylist to allow duplicates
        //ArrayList<String>convert = new ArrayList<>(list);
        System.out.println("Converted: "  + new ArrayList<>(list));


        Set<String> list2 = new LinkedHashSet<>();
        list2.add(null);
        list2.add("hello");
        list2.add("$4.0");
        list2.add("100");
        list2.add("hello");
        list2.add("%");
        System.out.println("HashSet: " +list);
        System.out.println("LinkedHashSet: " + list2);

    }
}
