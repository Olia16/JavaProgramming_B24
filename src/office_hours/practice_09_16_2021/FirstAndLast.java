package office_hours.practice_09_16_2021;

import java.util.Arrays;

public class FirstAndLast {
     /*
        Given a String array
        first letter and the last letter of each element
     */

    public static void main(String[] args) {

        String [] arr = {"apple", "tree", "shed", "marker", "pen"};

        for(String each : arr ){

            System.out.println("First character: " + each.charAt(0)); // each.substring(0,1)

            System.out.println("Last character: " + each.charAt(each.length() - 1)); // each.substring(each.length() - 1)

            System.out.println();

        }

    }

}
