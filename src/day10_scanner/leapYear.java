package day10_scanner;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {


    /*
    create a class LeapYear
create a main method
create a Scanner object

Ask the user to enter a year.
Determine if the year is a leap year or not.
You can assume a leap year is a year that is divisible by 4.
Print true or false.

Hint: use remainder operator
     */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year:");

        double year = input.nextDouble();
        boolean leapYear = year%4 ==0;


        System.out.println("Is it a leap year:" + leapYear );

    }

}
