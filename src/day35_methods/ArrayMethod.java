package day35_methods;

import java.util.Arrays;

public class ArrayMethod {
    public static void main(String[] args) {
        int [] a = {1, 2, 4, 7, 5, 4, 8};
       // Arrays.sort(a);
       firstElementOfArray(a);
       lastElementOfArray(a);
       middleElementOfArray(a);
        /*
        make method that accepts the array
        find and print the first element
        last element
        middle element
         */
    }
    public static void firstElementOfArray(int [] arr1){
        System.out.println("First element: " + arr1 [0]);
    }
    public static void lastElementOfArray(int [] arr1){
        System.out.println("Last element: " + arr1[arr1.length-1]);
    }
    public static void middleElementOfArray(int [] arr1){
        if(arr1.length % 2 == 1){
            System.out.println("middle character: " + arr1[arr1.length/2] );
        }else{
            System.out.println("middle character: " + arr1[arr1.length/2 -1] +" & " + arr1[arr1.length/2]);
        }
    }
}
