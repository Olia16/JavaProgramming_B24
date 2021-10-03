package day40_arraylist;

import java.util.ArrayList;

public class RemoveByValueMethod {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("pen");
        list.add("mouse");
        list.add("marker");
        System.out.println(list);

        // remove method("String") - returns boolean value
        boolean removed = list.remove("mouse");  // remove method is overloaded, one accepts - int type, other - String
        System.out.println(list);
        System.out.println(removed);

        boolean removed2 = list.remove("hat"); // if the original String doens't contain remove("element"), boolean false
        System.out.println(removed2);
        System.out.println(list);

        list.clear();
        System.out.println(list);

    }
}
