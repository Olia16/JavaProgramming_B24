package day19_string;

import java.util.Scanner;

public class MergeChars {

    /*
    String one:abc
    String two:def

    merge to get : adbecf

     */
    public static void main(String[] args) {

        String one = "abc";
        String two = "def";

        String merged = "";
        merged += one.charAt(0); // merged = merged + one.charAt(0); -> merged = "" + a
        merged += two.charAt(0); // merged = merged + two.charAt(0); -> merged = a + d

        merged += one.charAt(1);  // merged = merged + two.charAt(1); -> merged = ad + b
        merged += two.charAt(1);

        merged += one.charAt(2);
        merged += two.charAt(2);

        System.out.println(merged);
    }
}
