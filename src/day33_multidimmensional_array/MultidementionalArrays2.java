package day33_multidimmensional_array;

import java.util.Arrays;

public class MultidementionalArrays2 {
    public static void main(String[] args) {

        int [] [] arr = {
                {10, 20, 30, 40},
                {100, 200, 300, 400},
                {1000, 2000}
        };

        System.out.println(arr[0].length);
        System.out.println(Arrays.toString(arr[0]));

        System.out.println(arr[1].length);
        System.out.println(Arrays.toString(arr[1]));


        System.out.println(arr[2].length);
        System.out.println(Arrays.toString(arr[2]));

        System.out.println(Arrays.deepToString(arr));

        System.out.println("First array: " + arr[0][0]);
        System.out.println("Second array: " + arr[1][0]);
        System.out.println("Third array: " + arr[2][0]);

        System.out.println("First array, last element: " + arr[0][arr[0].length-1]);
        System.out.println("Second array,last element: " + arr[1][arr[1].length-1]);
        System.out.println("Third array, last element: " + arr[2][arr[2].length-1]);

    }
}
