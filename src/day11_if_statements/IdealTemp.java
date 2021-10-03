package day11_if_statements;

import java.util.Scanner;

public class IdealTemp {
    /*
    4-Write an if statement that prints Ideal Temp if the temp is between 70 and 80
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        int temp = input.nextInt();

        if(temp >= 70 && temp <= 80) {
            System.out.println("The temperature is ideal ");
        }



    }
}
