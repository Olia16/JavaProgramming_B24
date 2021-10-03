package day16_switch;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        /*
        add new class DaysInWeek (redo)
add a main method

Write a program that will display the given day based on a number input.
Start with 1 for Monday up to 7 for Sunday. Handle the invalid day numbers

    Ex:
        input: 2
        output: Tuesday
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a day number from 1-7");
        int day = input.nextInt();
        String dayInWords = " ";
        switch (day) {
            case 1:
                dayInWords = "Monday";
                break;
            case 2:
                dayInWords = "Tuesday";
                break;
            case 3:
                dayInWords = "Wednesday";
                break;
            case 4:
                dayInWords = "Thursday";
                break;
            case 5:
                dayInWords = "Friday";
                break;
            case 6:
                dayInWords = "Saturday";
                break;
            case 7:
                dayInWords = "Sunday";
                break;
            default:
                dayInWords = "Invalid day number. Needs to be between 1-7";

        }
        System.out.println(dayInWords);
        System.out.println(day);
    }
}
