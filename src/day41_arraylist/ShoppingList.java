package day41_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String > list = new ArrayList<>();
        System.out.println(list.size());

       if (list.isEmpty()){
           System.out.println("You should add something to your list");
       }else{
           System.out.println("Your list has some things");
       }

       String keepAsking = "";
       do {
           System.out.println("what would you like to add to your list?");
           String item = input.nextLine();
           list.add(item);
           System.out.println("Would you like to add anything else?");
           keepAsking = input.nextLine();

       }while (keepAsking.equalsIgnoreCase("yes"));

        System.out.println("This is your shopping list: " + list);
        System.out.println("Size after adding items: " + list.size());

        if (list.isEmpty()){
            System.out.println("You should add something to your list");
        }else{
            System.out.println("Your list has some things");
        }

        System.out.println("Do you want to remove anything?");
        String wantToRemove = input.nextLine();
        if(wantToRemove.equalsIgnoreCase("yes")){
            System.out.println("What do you want to remove?");
            list.remove(input.nextLine());
        }
        System.out.println("Your shopping list: " + list);



    }
}
