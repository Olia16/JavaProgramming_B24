package day29_array;

import java.util.Scanner;

public class PickMonth {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String [] months = {
                "January", "February","March", "April", "May", "June", "July",
                "August", "September", "October", "November","December"};
        System.out.println("Enter a month number");
        int monthNum = input.nextInt();

        System.out.println("The month you picked is: " + months[monthNum -1]);// allows us to go from number to index

    }
}
