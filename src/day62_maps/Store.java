package day62_maps;

import java.util.HashMap;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        //item name - price

        HashMap<String, Double> inventory = new HashMap<>();
        inventory.put("Water", 1.5);
        inventory.put("Fruits", 4.5);
        inventory.put("Bread", 2.99);
        inventory.put("eggs", 2.99);
        System.out.println(inventory);

        Scanner input = new Scanner(System.in);
        System.out.println("What do you want to buy?");
        String item = input.next();
        if (inventory.containsKey(item)){
            System.out.println("item is in stock");
            System.out.println(item + " costs " + inventory.get(item));
        }else{
            System.out.println( item + " not in stock");
        }

    }
}
