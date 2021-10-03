package day09_scanner_logical;

import java.util.Scanner;

public class YourName {

public static void main (String []args){

    /*
    Ask the user to enter their first name
    Ask the user to enter their last name
    print full name

    use next() -> reads only a single world


     */

    Scanner input = new Scanner(System.in);

    System.out.println("Enter user first name:");
    String firstName = input.next();
    System.out.println("Enter full name:");
    String lastName = input.next();

    System.out.println("Your full name is: " + firstName + " " + lastName );



}

}
