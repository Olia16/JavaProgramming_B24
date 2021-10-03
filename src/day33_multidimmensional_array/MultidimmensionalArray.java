package day33_multidimmensional_array;

import java.util.Arrays;

public class MultidimmensionalArray {

    public static void main(String[] args) {

        int [] a = { 1, 2, 3}; // single dimensional
        int [] b = { 4, 5, 6}; // single dimensional

        int [] [] all = {a, b};

        System.out.println(Arrays.toString(all[0])); // prints whole  a array/first element;
        System.out.println(Arrays.toString(all[1])); // prints whole  b array/second element;
        System.out.println(all.length);  // gives the length of arrays in multidimensional array

        System.out.println(Arrays.deepToString(all)); // prints the whole - 2D array

        int [] arr1 = { 4, 5, 8, 2};
        int [] arr2 = { 8, 7, 6, 4};
        int [] [] arr1and2 = {arr1, arr2};

        System.out.println(Arrays.deepToString(arr1and2));
    }

}
