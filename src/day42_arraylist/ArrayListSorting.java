package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListSorting {
    public static void main(String[] args) {

        // how to sort arraylist
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(4, 50, 20, 50, -4, -10, 150));

        // collections - is class that has many utility methods, works for many types besides arraylist
        // class that useful utilities methods, arraylist is one of the collections
        Collections.sort(nums);
        System.out.println(nums);
    }
}
