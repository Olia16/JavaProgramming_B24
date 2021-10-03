package day30_array_for_each_loop;

import java.util.Locale;

public class Countries {
    public static void main(String[] args) {
        /*
        - find and print all the first and last characters
         */
        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam", "Albania", "Brazil",
                "Portugal", "China", "Turkey", "Philippines", "Philippines", "China", "Philippines",
                "China", "Armenia", "Philippines", "China", "Colombia", "Philippines",
                "Honduras", "Indonesia", "Brazil", "China", "United States", "Ukraine"};

        // traditional loop
        for(int i = 0; i < countries.length; i++){
            String each = countries[i].toUpperCase(Locale.ROOT);
            System.out.println("Name of country: " + each);
            System.out.println("First letter is: " + each.charAt(0));
            System.out.println("Last letter is: " + each.charAt(each.length()-1));
            System.out.println("Middle letter is: " + each.charAt(each.length() / 2));

            System.out.println();
        }
        // for each loop
        for(String each : countries){
             each = each.toUpperCase(Locale.ROOT);
            System.out.println("Name of Country: " + each);
            System.out.println("First letter is: " + each.charAt(0));
            System.out.println("Last letter is: " + each.charAt(each.length()-1));
            System.out.println("Middle letter is: " + each.charAt(each.length() / 2));

            System.out.println();
        }


    }
}
