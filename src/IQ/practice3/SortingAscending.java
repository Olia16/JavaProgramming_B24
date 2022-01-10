package IQ.practice3;

import java.util.ArrayList;
import java.util.Arrays;

public class SortingAscending {
    /*
    1.Sorting in ascending
Write a method that can sort the ArrayList in Ascending order without using the sort method.
     */
    public static void main(String[] args) {

        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(2,6,4,1,9,2));

        for(int i = 0; i < list.size(); i++){
            int min = 0;
            for(int j = 0; j < list.size(); j++){
                if (list.get(i) < list.get(j)){
                    min = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j ,min);
                }
            }
            System.out.println(list);
        }

    }
}
