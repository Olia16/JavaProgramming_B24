package day10_scanner;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        /*

        create a class Divisible
        create a main method
        create a Scanner object
        Ask the user to enter a number.
        Check if that number is evenly divisible by 2, 3, and 5.
        Print the boolean valuesEx:
        Enter a number6565 is divisible by 2: false
        65 is divisible by 3: false
        65 is divisible by 5: true

         */


        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:" );
        int num = input.nextInt();

        boolean isDivisibleBy2 = num % 2 == 0;
        boolean isDivisibleBy3 = num % 3 == 0;
        boolean isDivisibleBy5 = num % 5 == 0;

        System.out.println(num + " is divisible by 2:" + isDivisibleBy2);
        System.out.println(num + " is divisible by 3:" + isDivisibleBy3);
        System.out.println(num + " is divisible by 5:" + isDivisibleBy5);

        input.close();



    }
}
