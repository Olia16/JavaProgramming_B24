package day34_methods;

import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        getAge(2000);
        getAge(1990);
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your birth year");
        int year = input.nextInt();

        getAge(year);

    }
    public static void getAge(int year){
        System.out.println("Your age in 2021 is: ");
        System.out.println(2021 - year);

    }
}
