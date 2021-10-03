package day40_arraylist;

public class ParseVsValueOf {
    public static void main(String[] args) {

        String s = "30";
        System.out.println(s + 5);
        // System.out.println(s < 60);  don't work, needs to be converted to primitive

        int seconds = Integer.parseInt(s); // converts "30" String into the int value of 30

        System.out.println(seconds < 60);
        // Integer wrapper class
        // converts the String "30" into the Integer wrapper class object
        Integer num = Integer.valueOf(s);
        System.out.println(num < 60);

        String s2 = String.valueOf(seconds);  // converts int seconds f 30 to the String object
        System.out.println("String: " + s2);
        System.out.println(s2.charAt(0));

    }
}
