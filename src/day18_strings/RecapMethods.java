package day18_strings;

public class RecapMethods {
    public static void main(String[] args) {
        String word = "day";
        String day = "thursday";

        boolean b = day.equals("Thursday");
        System.out.println(b);
        System.out.println(day.equalsIgnoreCase("Thursday"));

        day = day.toUpperCase();
        System.out.println(day);
        System.out.println(day.toLowerCase());
        System.out.println(day);

        System.out.println(day.length() + 1);
        System.out.println(day);

        day = day.length() + "";
        System.out.println(day + 2);
    }
}
