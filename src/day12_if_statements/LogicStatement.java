package day12_if_statements;

public class LogicStatement {
    /*
    Write a Java program to implement following logic using if statement
    1. if hour is less than 12 noon, greet with Good Morning
    2. if hour is greater than or equal 12 noon but less than 3 pm, greet with Good Afternoon
    3. if hour is greater than or equal to 3 pm, greet with Good Evening
     */

    public static void main(String[] args) {
        // 24 hour format

        int hour = 1;

        // 11 and before
        if(hour < 12 && hour < 0){
            System.out.println("Good morning");

        }
        // hour is between 12 - 15 afternoon -> 3pm
        if(hour >= 12 && hour < 15){
            System.out.println("Good afternoon");

        }
        // 15 + is the evening -> after 3 pm
        if(hour >= 15 && hour < 22){
            System.out.println("Good evening");

        }
        if((hour >= 22 && hour >= 24) || (hour > 0 && hour < 6)){
            System.out.println("Good morning");
        }





    }
}
