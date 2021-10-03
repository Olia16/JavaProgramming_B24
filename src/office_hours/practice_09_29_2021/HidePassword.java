package office_hours.practice_09_29_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class HidePassword {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("one", "two", "hold", "hi"));
        System.out.println(hidePasswords(list));


    }

    public static ArrayList<String> hidePasswords(ArrayList<String> list) {

        for (int i = 0; i < list.size(); i++) {

            String stars = convertToStars(list.get(i));

            list.set(i, stars);
        }
        return list;
    }

    // helper method, separate action refactored out as a method

    public static String convertToStars(String str) {

        // one -> ***

        String stars = "";

        for (int i = 0; i < str.length(); i++) {
            stars += "*";
        }
        return stars;
    }
}