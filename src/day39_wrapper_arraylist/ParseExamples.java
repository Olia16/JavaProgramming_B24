package day39_wrapper_arraylist;

import java.util.Scanner;

public class ParseExamples {
    public static void main(String[] args) {

        // converting String characters to integer number

        String year = "2009";

        int intYear = Integer.parseInt(year); // actual math
        System.out.println(year);
        System.out.println(intYear);

        System.out.println(year + 1);
        System.out.println(intYear + 1); // addition

        System.out.println();

        /*
        ask the user to enter some text
        I am x yeas old
        in 5 years you will be: age
         */
        System.out.println();

        // converting string numbers into int
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the text ");
        String text = input.nextLine();

        String ageText = text.split(" ")[2];

        int age = Integer.parseInt(ageText);
        System.out.println("In 5 years you will be " + (age + 5));

        System.out.println();

        // converting string numbers into double
     String priceStr = "112.99";
     double priceDouble = Double.parseDouble(priceStr);
     System.out.println(priceDouble);

     // parse method return the primitive data types // autoboxing
        //Ex: parseInt(), parseDouble()
     // value Od methods return the wrapper class objects// unboxing
        //Ex: Integer.valueOf(), Double.valueOf()

    }
}
