package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Caffeine {
    /*
   we have an array list of caffeinated drinks
   figure out how much caffeine each drink has and store that into a new ArrayList

   coffee - 80
   tea - 50
   monster - 100
   red bull - 100
   coke - 70
   pepsi - 70
   bang - 100
   apple juice - 0
    */
    public static void main(String[] args) {

        //this is defined information to work with
        String [] allDrinks = {"coffee", "tea", "monster", "red bull", "coke", "pepsi", "bang", "apple juice"};

        // converted array into ArrayList
        ArrayList<String> drinkList = new ArrayList<>( Arrays.asList(allDrinks) );

        ArrayList<Integer> caffeineAmounts = new ArrayList<>();

        // looping thru drinkList && putting the caffeine amount into the other ArrayList
        for(String eachDrink : drinkList) {

            int caffeineNum = 0;

            switch (eachDrink) {
                case "apple juice":
                    caffeineNum = 0;
                    break;
                case "tea":
                    caffeineNum = 50;
                    break;
                case "coke":
                case "pepsi":
                    caffeineNum = 70;
                    break;
                case "coffee":
                    caffeineNum = 80;
                    break;
                case "monster":
                case "red bull":
                case "bang":
                    caffeineNum = 100;
                    break;
            }

            // actual adding caffeine number to arrayList
            caffeineAmounts.add(caffeineNum);

        }
       // System.out.println(drinkList);
       // System.out.println(caffeineAmounts);

        //printing table
        System.out.println("====== Caffeine Table ========");

        for (int i = 0; i < drinkList.size(); i++){
            System.out.println("Drink: " + drinkList.get(i));
            System.out.println("Caffeine amount: " + caffeineAmounts.get(i));
            System.out.println("*****");
        }
        System.out.println("====== The End ========");

    }

}
