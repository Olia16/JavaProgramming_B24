package my_utilities;

import java.util.Locale;

public class StringUtil {

    // reverse method
    // it will accept the string parameter amd return the reverse version of the String
    public static String reverse(String original){
     String reverse = "";
     for(int i = original.length() - 1; i >= 0; i--){
         reverse += original.charAt(i);
     }
     return reverse;

     // fixed Case format, first char is Uppercase, rest lower
    }
    public static String fixedFormat(String i){
        return i.substring(0,1).toUpperCase(Locale.ROOT) + i.substring(1).toLowerCase(Locale.ROOT);
    }

    // This method wil count how many times a certain letter is in the given String
    // returns the counter value
    public static int frequencyOfLetter(String word, char letter){
        int counter = 0;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i)== letter){
                counter++;
            }
        }
        return counter;
    }

    // duplicate method
    // returns only one time the duplicate char
    public static String getDuplicateCharacters(String str){
        String allDuplicate = "";
        for(int i = 0; i < str.length(); i++){
            if(!allDuplicate.contains("" + str.charAt(i))){
                int count = frequencyOfLetter(str, str.charAt(i));
                if(count > 1){
                    allDuplicate+= str.charAt(i);
            }
           }
        }
        return allDuplicate;
    }
}
