package IQ.practice3;

import java.util.ArrayList;
import java.util.Arrays;

public class SortingDescending {
    /*
    2.Sorting in descending order
Write a method that can sort the ArrayList in descending order without using the sort method.
     */

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,6,4,1,9,2,0));

        for(int i = 0; i < list.size(); i++){
            int max = 0;
            for(int j = 0; j < list.size(); j++){
                if (list.get(i) > list.get(j)){
                    max = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j ,max);
                }
            }
            System.out.println(list);
        }

    }
}
