package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListFrequency {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(52, 4, 2, 4, 7, 5, 8, 9, 4));

        // collection - is a class with useful utility methods
        // find out how many '5' elements are in your ArrayList
        System.out.println(Collections.frequency(nums, 5));


    }
}
