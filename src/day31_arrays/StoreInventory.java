package day31_arrays;

import java.util.Arrays;

public class StoreInventory {
    public static void main(String[] args) {
        String [] items  = { "Shoes", "Jackets", "Gloves", "AirPod", "Ipod", "Backpack"};
        double [] prices = { 89.99, 150.0, 9.99, 250.0, 439.5, 39.99};
        int  []  itemIds = { 12345, 12346, 12347, 12348, 12349, 12350};

        boolean hasJackets = false;
        for (String eachItem : items){
            if(eachItem.equalsIgnoreCase("Jackets")){
                hasJackets = true;
                break;
            }
        }
        if(hasJackets){
            System.out.println("Yes, we have jackets! Do you want to see some?");
        }else{
            System.out.println("Sorry, but we don't have jackets");
        }
        // printing all the information
        //item id\ name \ price
        for(int i = 0; i < items.length; i++){
            System.out.println(itemIds[i] + " | " +  items[i] + " | $" + prices[i]);
        }
        //find the most expensive item

        double maxPrice = prices[0];
        int indexOfMax = 0;
        for(int i = 0; i < items.length; i++){
            if(prices[i] > maxPrice){
                maxPrice = prices[i];
                indexOfMax = i;
            }
        }
        System.out.println("The most expensive item:");
        System.out.println("Item id: " + itemIds[indexOfMax]);
        System.out.println("Name: " + items[indexOfMax]);
        System.out.println("Price: " + prices[indexOfMax]);

    }
}

