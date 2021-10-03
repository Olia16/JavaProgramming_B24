package day36_methods;

import my_utilities.StringUtil;
import java.util.Scanner;

public class UsingStringMethods {

    public static void main(String[] args) {
        System.out.println(StringUtil.reverse("java"));
        System.out.println(StringUtil.reverse("soft skills"));

        String s = "racecar";
        String s2 = StringUtil.reverse(s);
        System.out.println("Is  " + s +" Palindrome: " + s.equals(s2));

        Scanner input = new Scanner (System.in);
        System.out.println("Enter some words to reverse ");
        System.out.println(StringUtil.reverse((input.nextLine())));


        /*
        method should accept the String and return a String in proper format
        first character is upper case and the rest is lower
         */

        System.out.println("Enter your first name");
        System.out.println(StringUtil.fixedFormat(input.next()));

        System.out.println("Enter your last name");
        System.out.println(StringUtil.fixedFormat(input.next()));
    }

}
