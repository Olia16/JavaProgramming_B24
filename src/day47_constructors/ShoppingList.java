package day47_constructors;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Item firstItem = new Item("Apples", 5, 1.33);
        firstItem.quantity += 5;
        firstItem.calculate();
        System.out.println(firstItem);

        String keepGoing = "yes";
        ArrayList<Item> shoppinglist = new ArrayList<>();

        while (keepGoing.equalsIgnoreCase("yes")){

            System.out.println("What is the item name");
            String name = input.nextLine();

            System.out.println("Please enter quantity");
            int quantity = input.nextInt();

            System.out.println("What is price?");
            double price = input.nextDouble();

            Item item = new Item(name,quantity,price);
            shoppinglist.add(item);


            System.out.println("do you want to keep adding items");
            input.nextLine(); // empty enter input

            keepGoing = input.nextLine();
        }

        System.out.println("\nShopping List: ");
        System.out.println(shoppinglist);
    }
}
