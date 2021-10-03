package day30_array_for_each_loop;

public class LongestCountry {
    public static void main(String[] args) {
        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam", "Albania",
                "Brazil", "Portugal", "Armenia", "Colombia", "Philippines",
                "Honduras", "Indonesia", "United States", "Ukraine", "UAE"};

        String smallest = countries[0];
        String largest = countries[0];
        for (String country : countries) {
            for (String each : countries) {
                if (each.length() < smallest.length()) {
                    smallest = each;
                }
                if (each.length() > largest.length()) {
                    largest = each;
                }
            }
        }
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }
}
