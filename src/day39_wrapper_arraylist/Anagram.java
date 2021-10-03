package day39_wrapper_arraylist;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
       // System.out.println((isAnagram("listen", "silent"));
    }

    public static boolean isAnagram(String word1, String word2) {

        word1 = word1.toLowerCase(Locale.ROOT);
        word2 = word2.toLowerCase(Locale.ROOT);
        char[] word3 = word1.toCharArray();
        char[] word4 = word2.toCharArray();

        boolean isAnagram = false;
        int count = 0;
        Arrays.sort(word3);
        Arrays.sort(word4);
        if (word3.length != word4.length) {
            isAnagram = false;
        }
        for (int i = 0; i <= word3.length; i++) {
            for (int j = 0; j <= word4.length; i++) {
                if (word3[i] == word4[i]) ;
                count++;
            }
        }
        if (count == word3.length) {
            isAnagram = true;
        }
        return isAnagram;

    }
    }





