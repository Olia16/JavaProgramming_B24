package day39_wrapper_arraylist;

import java.util.ArrayList;

public class AddToArrayList {
    public static void main(String[] args) {

        ArrayList <Integer> numbers = new ArrayList<>();
        System.out.println(numbers);
        numbers.add(50);// add will put the element to the end of the list
        System.out.println(numbers);
        numbers.add(-30);// add will put the element to the end of the list
        System.out.println(numbers.add(50)); // add method also returns boolean
        numbers.add(100);
        System.out.println(numbers);

        // reading first element from array list:
        System.out.println("First element: " + numbers.get(0));
        System.out.println("Last element: " + numbers.get(numbers.size() - 1));  // numbers.size()- size of array list
        System.out.println("Middle element: " +numbers.get(numbers.size()/2));

    }
}
