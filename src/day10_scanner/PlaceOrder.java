package day10_scanner;

import java.util.Scanner;

public class PlaceOrder {
    public static void main(String[] args) {
        /*
        create a class PlaceOrder
create a main method
create a Scanner object


Ask the user to enter the product name (String, multiple words)
Ask the user to enter the price (double)
Ask the user to enter the quantity(int)
Ask the user to enter their full name (String, multiple word)

Print in the following format:
        "$firstName, your order for $quantity $productName has been placed. Your total is $totalCost(price * quantity)."

    Ex:
        Input: "Apples" , 1.5, 5. "Luke"
        Output: Luke, your order for 5 Apples has been places. Your total is 7.5.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the product name");
        String productName = input.nextLine();

        System.out.println("Enter the price");
        double price = input.nextDouble();

        System.out.println("Enter the quantity");
        int quantity = input.nextInt();

        input.nextLine();

        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        //"$firstName, your order for $quantity $productName has been placed. Your total is $totalCost(price * quantity)."



        System.out.println(fullName + ", your order for " + quantity + " " + productName + " has been placed .Your total is $total is " + (price * quantity));

    }
}
