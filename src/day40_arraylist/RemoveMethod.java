package day40_arraylist;

import java.util.ArrayList;

public class RemoveMethod {
    public static void main(String[] args) {

        ArrayList<String>list = new ArrayList<>();
        list.add("water");
        list.add("sun");
        list.add("wind");
        list.add("wood");
        System.out.println(list);

        // remove first element
        //removes the element by index
        list.remove(0);
        System.out.println(list);
        //remove last element
        list.remove(list.size()-1);
        System.out.println(list);

        System.out.println(list.remove(0));

        System.out.println();

        ArrayList<Integer>nums = new ArrayList<>();
        nums.add(50);
        nums.add(70);
        nums.add(80);

        System.out.println(nums);
        //remove method has a return type
        //you can remove and store its value to another variable
       int firstRemoved = nums.remove(1); // unboxing

        System.out.println("First removed element: " + firstRemoved);
        System.out.println(nums);

        // adding the removed element back into arrayList
        nums.add(firstRemoved);  // we can also add back removed number
        System.out.println(nums);
    }
}
