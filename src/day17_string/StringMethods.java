package day17_string;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String name = "james";
        System.out.println(name.equals("james"));
        System.out.println(name.equals("James"));
        System.out.println(name.equalsIgnoreCase("James"));
        System.out.println(name.equalsIgnoreCase("JaMeS"));

        System.out.println(name.toUpperCase());

        System.out.println(name);
        String lastName = "bond";
        lastName = lastName.toUpperCase();
        System.out.println(lastName);

        System.out.println(lastName.toLowerCase());


        String word = " Monday";  // calculates space as character too, so 6 becomes 7
        int length = word.length();
        System.out.println(length);


    }
}
