package day09_scanner_logical;

import java.util.Scanner;

public class NumbersEqual {

    public static void main (String []args){

        /*
        Ask the user to enter 2 numbers
        and check if the numbers are equal
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        double numOne = scan.nextDouble();

        System.out.println("Enter number 2:");
        double numTwo = scan.nextDouble();

        System.out.println(numOne + "is equal to" + numTwo + " : " + (numOne ==numTwo));

    }
}
