package day40_arraylist;

import java.util.ArrayList;

public class Classroom {
    public static void main(String[] args) {

        ArrayList<String> groupOne = new ArrayList<>();
        System.out.println(groupOne);
        System.out.println(groupOne.size());//how many elements is there

        groupOne.add("Vindar");
        groupOne.add("James Bond");
        groupOne.add("Tach");
        groupOne.add("Topcu");
        System.out.println(groupOne);

        System.out.println("First element: " + groupOne.get(0));
        System.out.println("Second element: " + groupOne.get(1));
        System.out.println("Third element: " + groupOne.get(2));
        System.out.println("Fourth element: " + groupOne.get(3));
        System.out.println("Last element: " + groupOne.get(groupOne.size()-1));
        System.out.println("First element, first character: " +groupOne.get(0).charAt(0));

        System.out.println();
        // capacity example
        ArrayList<String> groupTwo = new ArrayList<>(20);
        System.out.println(groupTwo.size());

        System.out.println();

        ArrayList<String> groupThree = new ArrayList<>();
        groupThree.add("Nisso"); // [Nisso]
        groupThree.add(0,"Omer"); // [Omer, Nisso]
        // you can place the String in the order you want,
        // giving an index number where you want to store it and then String
        groupThree.add("Kamila"); // [Omer, Nisso,Kamila]
        groupThree.add(0,"Bogdan"); // [Bogdan, Omer, Nisso, Kamila]
        groupThree.add(1, "James"); // [Bogdan, James, Omer, Nisso, Kamila]


        System.out.println(groupThree);


    }
}
