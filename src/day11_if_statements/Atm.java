package day11_if_statements;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** Welcome to the Atm ***");
        System.out.println("Please enter your passcode");
        int inputPasscode = input.nextInt();
        int validPasscode = 1234;

        if(inputPasscode == validPasscode){
            // valid and logged in
            System.out.println("Logged in! ");
            System.out.println("Select a number");
            System.out.println("\t1) Check balance");
            System.out.println("\t2) Deposit");
            System.out.println("\t3) Withdraw");
            int selection = input.nextInt();
           if(selection == 1){
               System.out.println("Your balance is: $" + 1_000_000);

           }
           if (selection == 2){
               System.out.println("Enter your bills in the slot");
           }
           if(selection == 3){
               System.out.println("Take your money from dispenser");
           }




        }else {
            System.out.println("Invalid passcode");
            System.out.println("try again");
        }
        System.out.println("Thank you for using our bank1");





    }
}
