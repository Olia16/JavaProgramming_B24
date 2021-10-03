package day10_scanner;

import java.util.Scanner;

public class ShoppingList {
    /*
    In this assignment you will write a program to create a shopping list and prices.

You will use Scanner object and ask user to enter 3 items followed by its price and you will calculate total price and show as a report.

-Declare 4 String variables item1, item2, item3, report.

-Declare double variables price1, price2, price3, totalPrice

-Create a Scanner object named scan.

Example:

Enter Item1 and its price:
Tomatoes
5.5
"Enter Item2 and its price:
Cheese
3.5
Enter Item3 and its price:
Apples
6.3

Output:
Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3
Total price: 15.3
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String item1, item2, item3, report = " ";
        double price1, price2, price3, totalPrice = 0;

        System.out.println("Enter Item1 and its price:");
        item1 = input.nextLine();
        price1 = input.nextDouble();
        totalPrice += price1;
        report += "Item1: " + item1 + "Price: " + price1 + " ,";

        input.nextLine();

        System.out.println("Enter Item2 and its price:");
        item2 = input.nextLine();
        price2 = input.nextDouble();
        totalPrice += price2;
        report += "Item2: " + item2 + "Price: " + price2 + " ,";

        input.nextLine();

        System.out.println("Enter Item3 and its price:");
        item3 = input.nextLine();
        price3 = input.nextDouble();
        totalPrice += price3;
        report += "Item3:" + item3 + "Price: " + price3 + " ,";

        // Output:
        //Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3
        //Total price: 15.3

        System.out.println(report);
        System.out.println("Total price: " + totalPrice);



    }
}
