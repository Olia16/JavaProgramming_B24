package office_hours.practice_09_29_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class sumNumFromList {

    public static ArrayList<Integer> getSumOfString(ArrayList<String> list){

        ArrayList<Integer> numbers = new ArrayList<>();

        for(String each : list){
            int sum = 0;

            for(int i = 0; i < each.length(); i++){
               sum += Integer.parseInt("" + each.charAt(i)) ; // parseInt -> take string and convert to a number
            }
            numbers.add(sum);
        }
        return numbers;

    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("123","12","1234"));

        System.out.println(getSumOfString(list));
    }

}
