package day31_arrays;

import java.util.Arrays;

public class CountWords {
    public static void main(String[] args) {
        String s = "Java is fun";
        String [] java = s.split(" ");

        System.out.println(Arrays.toString(java));
        System.out.println(java.length); // gives a number of words(elements) in sentence

        String cats = "bengal cat tabby cat persian cat no cat here";
        String [] arr = cats.split(" cat ");

        System.out.println(Arrays.toString(arr)); // removes whatever in split method ("");
    }
}
