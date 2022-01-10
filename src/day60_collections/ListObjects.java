package day60_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListObjects {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add(null);
        System.out.println(list);
        System.out.println(list.get(2)); //array[2]

        List<String>linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        linked.add("c");
        linked.add(null);
        System.out.println(linked);
        System.out.println(linked.get(2));
        ((LinkedList)linked).addFirst("hello"); //casting in order to access method 'addFirst'
        System.out.println(linked);

        List<String>vector = new Vector<>();
        vector.add("a");
        vector.add("b");
        vector.add("c");
        vector.add("c");
        vector.add(null);
        System.out.println(vector);

    }
}
