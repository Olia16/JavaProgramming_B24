package day10_scanner;

import java.util.Scanner;

public class ChangeMachine {
    /*
    Change machine
Ask the user to enter some number from 1-99

    quarters
    dimes
    nickels
    pennies


Ex:
    80

    3 quarters
    0 dimes
    1 nickels
    0 pennies


Hint: use %
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int userMoney, quarters, dimes, nickles, pennies;

        System.out.println("Hello, welcome to the change machine");
        System.out.println("Please enter your cents from 1-99");
        userMoney = input.nextInt(); // 83

        quarters = userMoney / 25;  // 83 / 25 -> 3  | 83 - 75 = 8
        userMoney %= 25;     // 8
        dimes = userMoney / 10; // 8 / 10
        userMoney %= 10;  // 8 % 10 -> 8
        nickles = userMoney / 5; // 8 / 5 -> 1 | 8 - 5 => 3
        userMoney %= 5; // 3
        pennies = userMoney;

        System.out.println("Your change is:");
        System.out.println("quarters: " + quarters);
        System.out.println("dimes: " + dimes);
        System.out.println("nickles: " + nickles);
        System.out.println("pennies: " + pennies);

    }

}
