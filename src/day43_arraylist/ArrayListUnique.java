package day43_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListUnique {
    public static void main(String[] args) {

        ArrayList<Integer>list2 = new ArrayList<>(Arrays.asList(4, 5, 6, 5, 6, 1, 0, 5, 10, 7, 18));

        System.out.println(getUniqueElements(list2));
    }


    /*
    create a method that accepts an ArrayList and return an ArrayList of only unique values/characters
     */
                  // return type      method name          parameters
    public static ArrayList<Integer> getUniqueElements (ArrayList<Integer> list){

        ArrayList<Integer> unique = new ArrayList<>();
        for(int each : list){

          int count =  Collections.frequency(list, each);

          if(count == 1){
              //unique element
              unique.add(each);
          }
        }
        return unique;
    }
}
