package day41_arraylist;

import java.util.ArrayList;

public class ClearMethod {
    public static void main(String[] args) {

        ArrayList<Integer>  nums = new ArrayList<>();
        nums.add(100);
        nums.add(500);
        nums.add(700);
        nums.add(900);
        System.out.println(nums);

        // clear method, completely removes everything and returns only an empty brackets
        nums.clear();
        System.out.println(nums);
        // isEmpty method - returns boolean
        System.out.println(nums.isEmpty());

        // method .contains checks if the given element is found in the array list
        // return boolean
        System.out.println(nums.contains(50));



    }
}
