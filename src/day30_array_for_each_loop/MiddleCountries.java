package day30_array_for_each_loop;

public class MiddleCountries {
    public static void main(String[] args) {
        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam", "Albania", "Brazil",
                "Portugal", "China", "Turkey", "Philippines", "Philippines", "China", "Philippines",
                "China", "Armenia", "Philippines", "China", "Colombia", "Philippines",
                "Honduras", "Indonesia", "Brazil", "China", "United States", "Ukraine"};

        for (String country : countries){
            int mid = country.length() / 2;

            if(country.length() % 2 == 0){
                // two middle character
                System.out.println(country.substring(mid - 1, mid + 1));
                //  System.out.println(country.charAt(mid - 1) + ""  + country.charAt(mid + 1)); - via charAt
                //  System.out.println(country.substring(country.length() / 2 - 1, country.length() / 2 + 1));

            }else{
                System.out.println(country.charAt(mid));
                // System.out.println(country.substring(mid, mid +1)); // via substring
                // one middle character
            }

        }
    }
}
