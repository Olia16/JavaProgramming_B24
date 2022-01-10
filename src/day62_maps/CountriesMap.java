package day62_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CountriesMap {

    public static void main(String[] args) {

        HashMap<String, ArrayList> countries = new HashMap<>();
        countries.put("Ukraine", new ArrayList(Arrays.asList("Kiev,Lviv, Lutsk")));
        countries.put("USA", new ArrayList(Arrays.asList("Chicago", "New York", "Miami")));
        countries.put("Germany", new ArrayList(Arrays.asList("Frankfurt", "Berlin")));
        System.out.println(countries);

        for(String eachKeys : countries.keySet()){
            System.out.println("Cities in " + eachKeys + " are: " + countries.get(eachKeys));
        }
        System.out.println();

        for(String eachKeys : countries.keySet()){
            System.out.println("Cities in " + eachKeys);
            for(String city : countries.keySet()){
                System.out.println(city.charAt(0));
            }
        }



    }
}
