package day41_arraylist;

import java.util.ArrayList;

public class RemoveByObject {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(500);
        nums.add(700);
        nums.add(900);

        nums.remove(0);

        //in order to remove by object, we need an actual object,
        // if it is a number we need to convert it to object
        Integer a = 700; // converting primitive to object, autoboxing/ creates the Integer object
        nums.remove(a);

        // approach 2, making the object in remove method
        nums.remove(new Integer(900));
        System.out.println(nums);
    }
}
