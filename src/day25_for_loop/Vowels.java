package day25_for_loop;

import java.util.Locale;

public class Vowels {
    public static void main(String[] args) {
        String sentence = "love coding java; java is great";
        int count = 0;
        String vowels = "aeiou";

        for( int i = 0; i < sentence.length(); i++){
            if(vowels.contains(sentence.substring(i, i + 1))){   // we can also use --> "" + sentence.charAt(i)
                count++;
            }
        }
        System.out.println("We have " + count + " vowels in the string");
    }
}
