package day15_switch;

import java.util.Scanner;

public class AgeGroup {
    /* create a class AgeGroup
create a main method

        Write a program that can define the age groups of someone based on their given age:

    infant (< 1 year)
    Toddler (3 - 5)
    Kid (6 - 9
         Pre-Teen (10 - 12)
    Teenager (13 - 17)
    Young Adult (18 - 20)
    Adult (21 - 35)
    Middle-Aged Adult (36 - 55)
    Senior Citizen (55+)

    Challenge: if age > 120 or less than 0 ==> invalid entry

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();
        if(age > 0 && age <= 120) {

            //valid age
            if (age <= 1) {
                System.out.println("infant");
            } else if (age <= 5) { // else if (age >= 2 && age <= 5)
                System.out.println("Toddler");
            } else if (age <= 9) {  // else if (age >= 6 && age <= 9)
                System.out.println("Kid");
            } else if (age <= 12) {
                System.out.println("Pre Teen");
            } else if (age <= 17) {
                System.out.println("Teenager");
            } else if (age <= 20) {
                System.out.println("Young adult");
            } else if (age <= 35) {
                System.out.println("Adult");
            } else if (age <= 55) {
                System.out.println("Middle-Aged Adult");
            } else {
                System.out.println("Senior Citizen");
            }

        }else {
            System.out.println("Invalid age");
        }
    }
}
