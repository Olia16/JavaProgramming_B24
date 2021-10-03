package day16_switch;

import java.util.Scanner;

public class DaysInMonth {
    /*
    add new class DaysInMonth (redo)
add a main method

Write a program that will accept a month name and output how many days are in that month

    February: 28 days
    April, June, September, November: 30 days
    January, March, May, July, August, October, December: 31 days
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the month ");
        int days = 0;

        switch (input.next()) {
            case "February":
                days = 28;
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                days = 30;
                break;
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                days = 31;
                break;
            default:
                System.out.println("Invalid month entered");

        }
        if (days != 0) {
            System.out.println(days + " days");

        }
    }
}
