package office_hours.practice_09_29_2021;

import java.util.ArrayList;
import java.util.Arrays;


public class FourOrLess {
    /*
    Four or less
Given an ArrayList of Strings, go through and read only Strings that are 4 characters or less.
Take those Strings and put them into a different ArrayList
Ex:
Input:
“apples”, “tree”, “loop, “cat”, “animal”, “shortcut” Output:
[ tree, loop, cat ]
     */
    public static ArrayList<String> getWordsLessThanFour(ArrayList<String> list){
        ArrayList<String> validWords = new ArrayList<>();

        for(String each : list){
            if (each.length() <= 4){
                validWords.add(each);
            }
        }
        return validWords;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList(Arrays.asList("Hello", "java", "apple", "cat", "shortcut","hi"));
        System.out.println(getWordsLessThanFour(list ));
        System.out.println(getWordsLessThanFour2(list));
    }

    public static ArrayList<String> getWordsLessThanFour2(ArrayList<String> list){

        list.removeIf(str ->str.length() > 4 );
        return list;
    }

}
