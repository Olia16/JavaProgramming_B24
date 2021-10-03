package day32_arrays;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String one = "listen";
        String two = "silent";

        // convert String to char Arrays
        //to be able to compare characters

        char [] oneArr = one.toCharArray();
        char [] twoArr = two.toCharArray();

        // sort characters in order

        Arrays.sort(oneArr);
        Arrays.sort(twoArr);

        // comparing if 'one' equals 'two'
        System.out.println("Is anagram one same as anagram two? - : " + Arrays.equals(oneArr,twoArr));
    }
}
