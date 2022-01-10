package IQ.practice2;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveGreaterThan100 {
    /*
    ArrayList -- Remove some values
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */

    public static void main(String[] args) {

        Integer [] nums = {2, 56, 125, 14, 124, 150, 147, 185};
        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(nums));
        list.removeIf(element -> element > 100);
        System.out.println(list);

    }
}
