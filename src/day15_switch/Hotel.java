package day15_switch;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the java hotel!");
        System.out.println("How many people in your party?");
        int numberOfPeople = input.nextInt();
        System.out.println("How many days will you stay?");
        int numberOfDays = input.nextInt();

        double price = 0;
        String roomType = " ";
        boolean validPartySize = true;
        String peopleMessage = "people";

        switch (numberOfPeople) {
            case 1:
                roomType = "Single room";
                price = numberOfDays * 100;
                peopleMessage = "person ";
                break;
            case 2:
                roomType = "Double room";
                price = numberOfDays * 125;
                break;
            case 3:
            case 4:
                roomType = "Large room";
                price = numberOfDays * numberOfPeople * 150;
                break;
            case 5:
            case 6:
                roomType = "Suite";
                price = 5000;
                break;

            default:
                System.out.println("Party size is too big");

        }
        if (validPartySize) {
            System.out.println("Okay great, for " + numberOfPeople + peopleMessage +  " staying for " + numberOfDays + " days " + "your total price is: $" + price + " for a " + roomType);
        }
    }
}
