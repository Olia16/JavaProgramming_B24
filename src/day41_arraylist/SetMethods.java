package day41_arraylist;

import java.util.ArrayList;

public class SetMethods {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(500);
        nums.add(700);
        nums.add(900);
        System.out.println(nums);

        //how do you change a value/element
        // arr[index] = value

        // set method help to change/reassign the value
        nums.set(0, 1000);
        nums.set(nums.size()-1, -2000);
        System.out.println(nums);

        // set method is return method,
        // method in the print statement - will return the old value/replaced element
        System.out.println(nums.set(1,90));
        System.out.println(nums);
        System.out.println(nums.set(1,300));
        System.out.println(nums);

        nums.set(nums.size()-1, 400);
        System.out.println(nums);
    }



}
