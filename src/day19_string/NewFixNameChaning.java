package day19_string;

import java.util.Locale;
import java.util.Scanner;

public class NewFixNameChaning {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = input.nextLine().trim().toLowerCase(Locale.ROOT);
        System.out.println("Enter your last name");
        String lastName = input.nextLine().trim().toLowerCase(Locale.ROOT);

        String fixedFirstName = firstName.substring(0,1).toUpperCase(Locale.ROOT) + firstName.substring(1);
        String fixedLastName = lastName.substring(0,1).toUpperCase(Locale.ROOT) + lastName.substring(1);


        System.out.println(fixedFirstName + " " + fixedLastName);



    }
}
