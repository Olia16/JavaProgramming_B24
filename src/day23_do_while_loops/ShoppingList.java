package day23_do_while_loops;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        /*
        continue to store items to shopping list
         */
        Scanner input = new Scanner(System.in);
        String list = "";
        String addMore;

        do{
            System.out.println("Add item to list");
            list += input.nextLine() + ", ";
            System.out.println("Would you like to add anything else? y or n");
            addMore = input.nextLine();
        }while (addMore.equalsIgnoreCase("y"));
        System.out.println("This is your whole shopping list:");
        System.out.println(list.substring(0,list.length() - 2));
    }
}
