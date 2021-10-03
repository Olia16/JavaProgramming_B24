package office_hours.practice_09_16_2021;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {

        int [] arrOne = {1, 2, 3, 4, 5};
        int [] arrTwo = {10, 20, 30};

        int mergedLength = arrOne.length + arrTwo.length;
        int [] merged = Arrays.copyOf(arrOne, mergedLength);
        int index = arrOne.length;

        for(int each : arrTwo){
            merged [index++] = each;
        }

        System.out.println(Arrays.toString(merged));
    }
}
