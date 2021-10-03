package day10_scanner;

import java.util.Scanner;

public class Revenue {
    /*
    create a class Revenue
    create a main method
    create a Scanner object
    Ask the user to enter product price and quantity and then calculate the revenue.
    revenue = price Ã quantity.Â
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the product's price:");
        double price = input.nextDouble();
        System.out.println("Enter the product's quantity:");
        double quantity = input.nextDouble();

        double revenue = price * quantity;

        System.out.println("revenue is: " + revenue );


    }
}
