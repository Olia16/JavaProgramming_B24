package day16_switch;

import java.util.Scanner;

public class SeasonFinder {
    /*
    add new class SeasonFinder
add a main method

Given some month number determine which season it is

Winter: 12,1,2
Spring: 3,4,5
Summer: 6,7,8
Fall:   9,10,11

    Ex:
    when month = 2;
        OUTPUT:
            "Winter"

    when month = 7;
        OUTPUT:
            "Summer"
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the month number");
        int month = input.nextInt();
        String season = " ";

        switch (month){
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Fall";
                break;
            default:
                season = "Invalid month given";
        }
        System.out.println(season);

    }
}
