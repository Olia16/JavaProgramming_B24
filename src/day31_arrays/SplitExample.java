package day31_arrays;

import java.util.Arrays;

public class SplitExample {
    public static void main(String[] args) {
        // split up a String into a String array

        String s = "monday,tuesday,wednesday";
        String [] days = s.split(",");

        System.out.println(Arrays.toString(days));


        String s2 = "Jan-Feb-Mar-Apr";
        String [] months = s2.split("-");

        System.out.println(Arrays.toString(months));

        String s3 = "java is fun";
        String [] java = s3.split(" ");

        System.out.println(Arrays.toString(java));
    }
}
