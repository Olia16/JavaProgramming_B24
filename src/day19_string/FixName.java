package day19_string;

import java.util.Locale;
import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {
        /*
        ask the user to enter their first name
        last name

        make sure the name is properly formatting
        each first letter is capital, rest lower case
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = input.next();
        System.out.println("Enter your last name");
        String lastName = input.next();

       String firstNameFirstLetter = firstName.substring(0,1);
       String lastNameFirstLetter = lastName.substring(0,1);

       firstNameFirstLetter = firstNameFirstLetter.toUpperCase(Locale.ROOT);
       lastNameFirstLetter = lastNameFirstLetter.toUpperCase(Locale.ROOT);



        String remainingFirstName = firstName.substring(1);
        String remainingLastName = lastName.substring(1);

        remainingFirstName = remainingFirstName.toLowerCase(Locale.ROOT);
        remainingLastName = remainingLastName.toLowerCase();

        System.out.println(firstNameFirstLetter + remainingFirstName + " " + lastNameFirstLetter + remainingLastName);

    }
}
