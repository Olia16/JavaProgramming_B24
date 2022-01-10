package office_hours.practice_12_08_2021;

import java.util.Arrays;

public class AnagramWithCounterArray {

     /*
        The objective with this approach is to check every character in the String one at a time. The characters of the first String are going to be adding 1 in our counters and the characters in the second String are going to be subtracting 1 from our counters. The reason we do this is so that if our counters are 0 in the end they will be anagram, because all characters from both Strings were the same, just in different orders.
        The main part of the approach is an array with 26 positions. The reason two have 26 elements is that every element is a counter for each letter in the alphabet. For example the first position in our counter array is to hold the numbers of a's and the last position in the array is to hold the number of z's
        The way to get each character to an array position is to subtract 97 to the number. if the character is 'a' it will be doing 'a' - 97 -> remember this will take tha ascii value of 'a' and subtract 97, this means it will do 97 - 97 -> 0 which means the index 0 of the array is the position for 'a's. for b it would be 'b' - 97 or 98 - 97 = 1 which means the index 1 of the array is the position of the 'b's
        The first String will increment the counters and the second String will decrement the counters, if all counters are 0 in the end all had same characters and are anagram
     */

    public static boolean isAnagram (String one, String two){

        if(one.length() != two.length()) {
            return false;
        }

        one = one.toLowerCase();
        two = two.toLowerCase();

        int [] count = new int[26];

        for (int i=0; i < one.length(); i++) {

            char letterFromOne = one.charAt(i);
            char letterFromTwo = two.charAt(i);

            count[letterFromOne - 97] = count[letterFromOne - 97] + 1;
            count[letterFromTwo - 97] = count[letterFromTwo - 97] - 1;

        }

        return Arrays.equals(count, new int[26]);
    }
}
