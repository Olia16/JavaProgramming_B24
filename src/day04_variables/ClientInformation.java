package day04_variables;

import java.util.Scanner;

public class ClientInformation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello, please enter your first name below");
        String firstName = input.nextLine();

        System.out.println("Please enter your last name");
        String lastName = input.nextLine();

        System.out.println("Enter your age");
        int age = input.nextInt();

        System.out.println("Are you married?");
        String yesOrNo = input.nextLine();

        System.out.println("Hello,  " + firstName + " " + lastName + " Your age: " + age + " Your status: " + yesOrNo);

    }
}
