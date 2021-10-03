package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CountLetters {
    public static void main(String[] args) {
        // input: AAAABBCCCDDDDDDEE
        //output: A4B2C3D6E2
        System.out.println(countEachLetter("AAAABBCCCDDDDDDEE"));
    }
    public static String countEachLetter(String str){

        // how to convert String into ArrayList
        // we start with String str =""AABCDD"
        // made a String Array -> str.split("") -> ["A", "A", "B", "C", "D", "D"] as String array
        // Array.asList() - accepts the arrays and converts those arrays to an ArrayList
        // Arrays.asList(str) -> ["A", "A", "B", "C", "D", "D"] as an ArrayList
        //when we put a collection type inside the parenthesis it makes the ArrayList with those values

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        //count each element
        String result = "";
        for(String each: list){
            // if statement helps to avoid printing result multiply times
            if(!result.contains(each)){
                // storing collection method(frequency of each letter) into count
                int count  = Collections.frequency(list, each);
                result += each + count;
            }

        }
        return result;


    }

}
