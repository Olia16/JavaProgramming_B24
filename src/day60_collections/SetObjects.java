package day60_collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetObjects {
    public static void main(String[] args) {

        Set<String> list = new HashSet<>();
        list.add(null);
        list.add("hello");
        list.add("$4.0");
        list.add("100");
        list.add("hello");
        list.add("%");


        Set<String> list2 = new LinkedHashSet<>();
        list2.add(null);
        list2.add("hello");
        list2.add("$4.0");
        list2.add("100");
        list2.add("hello");
        list2.add("%");


        Set<String> list3 = new TreeSet<>();
       // list3.add(null);
        list3.add("hello");
        list3.add("$4.0");
        list3.add("100");
        list3.add("hello");
        list3.add("%");

        System.out.println("HashSet: " +list);
        //order is maintained by insertion
        System.out.println("LinkedHashSet: " + list2);
        //sorted in natural order(sorted); doesn't allow duplicates
        System.out.println("TreeSet: " + list3);
    }

}
