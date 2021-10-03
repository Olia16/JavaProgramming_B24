package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList {
    public static void main(String[] args) {

        Integer [] a = {1, 2, 3};  // this is needs to be Integer wrapper class cause primitive won't work

        Arrays.asList(a); // this allows to convert from the array to the array list -> collection type

        // converting the 'a' array to ArrayList
        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(a));
        System.out.println(list);

        //convert array to ArrayList and creating an array with values right away
        // var args - variable arguments
        ArrayList<Integer>list2 = new ArrayList<>(Arrays.asList(4, 6, 1, 6, 10, 102, 50, 50, 50, 20, 40));
        System.out.println(list2.isEmpty());
        System.out.println(list2);



    }
}
