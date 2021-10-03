package day10_scanner;

import java.util.Scanner;

public class EvenOrOdd {
    /*
    create a class EvenOrOdd
    create a main method
    create a Scanner object
    Ask the user to enter an int number,
    print if the number is even or odd as boolean values

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        long number = input.nextLong();

        boolean isEven = number %2 == 0;
        boolean isOdd = number % 2 != 0;

        System.out.println(number + " is even:" + isEven);
        System.out.println(number + " os odd:" + isOdd);


    }
}
