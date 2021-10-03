package day09_scanner_logical;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year:");
        double year = input.nextDouble();
        boolean leapYear = year%4 == 0;

        System.out.println("Is it a leap Year:" + leapYear);


    }
}
