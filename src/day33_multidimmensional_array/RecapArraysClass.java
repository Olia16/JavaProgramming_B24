package day33_multidimmensional_array;

import java.util.Arrays;

public class RecapArraysClass {
    public static void main(String[] args) {

        int [] arr =  {1, 3, 4 ,5 ,8, -10, 40};
        int [] arr2 = {40, -10, 5, 8, 4, 3, 1};

        System.out.println(Arrays.equals(arr, arr2));

        Arrays.sort(arr);   // sorting
        Arrays.sort(arr2);  // sorting

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        System.out.println(Arrays.equals(arr,arr2));
    }
}
