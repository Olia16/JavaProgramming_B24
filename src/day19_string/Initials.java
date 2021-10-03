package day19_string;

import java.util.Locale;
import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        /*
        ask the user to enter their first name
        last name
        print the initials

        bonus - give the initials as upper case
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.next();
        System.out.println("Enter your last name");
        String lastName = input.next();

        String initials = "" + firstName.charAt(0) + lastName.charAt(0);
        System.out.println(initials.toUpperCase(Locale.ROOT));
}
}