package day30_array_for_each_loop;

import java.util.Arrays;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        /*
        String array
       0- first name
       1- account number
       2- balance
       3- account type

         */

        String [] information = {"olha", "555555", "$450000", "checking"};
        System.out.println("first account: " + Arrays.toString(information));

        String [] information2 = new String [4];
        information2 [0] = "olha";
        information2 [1] = "555555";
        information2 [2] = "$4500000";
        information2 [3] = "checking";
        System.out.println("second account: " + Arrays.toString(information2));

        Scanner input = new Scanner(System.in);
        String [] information3  = new String[4];
        System.out.println("Enter your name");
        information3 [0] = input.next();
        System.out.println("Enter you account number");
        information3 [1] = input.next();
        System.out.println("Enter your balance");
        information3 [2] = input.next();
        System.out.println("What is your account type?");
        information3 [3] = input.next();

        System.out.println("third account: " + Arrays.toString(information3));

        // dynamic scanner input with arrays

        String [] bancAccountFour = new String[4];
        String [] questions = {"first name", "account number", "balance", "account type"};
        for (int i = 0; i < bancAccountFour.length; i++){
            System.out.println("Enter your " + questions[i]);
            bancAccountFour[i] = input.next();
            System.out.println("fourth account: " + Arrays.toString(bancAccountFour));
        }

    }
}
