package day43_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDays {
    public static void main(String[] args) {
        System.out.println(getDays());
        System.out.println(getDays(5));
        System.out.println(getDays(1));

        ArrayList<String> days = getDays();
        System.out.println(days.containsAll(Arrays.asList("Monday", "Friday", "Sunday")));
        System.out.println(days.containsAll(Arrays.asList("Monday", "April", "Sunday")));
    }
    /*
        Create a method that will return an ArrayList with all the days
           Monday, Tuesday, ... Sunday

          Overload the method, so it accepts the int number - which day of the week they want
          String

          Input: 1
          Output: Monday
     */
    public static ArrayList<String> getDays(){

        String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday","Sunday"};

        ArrayList<String> daysList = new ArrayList<>(Arrays.asList(days));

        return daysList;
    }

    //     changed return type to String, so we can give a parameter and get the day at that position
    public static String getDays(int day) {

        String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday","Sunday"};

        ArrayList<String> daysList = new ArrayList<>(Arrays.asList(days));


        return daysList.get(day-1);
    }

    }

