package day23_do_while_loops;

import java.util.Scanner;

public class AtmPin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int validPin = 1234;
        int userPin;
        int attempts = 0;
        do {
            System.out.println("Enter you pin");
            userPin = input.nextInt();
            attempts++;

        } while (attempts < 3 && userPin != validPin);

        if (userPin == userPin) {
            System.out.println("Welcome, you are logged in");
        } else {
            System.out.println("LOCKED OUT, TOO MANY ATTEMPTS");
        }
    }
}