package day29_array;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
//
//        // manual / old way to have a lot of information
//        String city1 = "San Fransisco";
//        String city2 = "Moscow";
//        String city3 = "Madison";
//        String city4 = "Tokyo";
//        String city5 = "Baghdad";
//
//        //this is the array to hold multiple data
//        // defining a String array with city information
//        // every piece in curly brackets called an 'element'
//        String [] cities = { "San Fransisco", "Moscow", "Madison", "Tokyo", "Baghdad"};
//        //each element has index:    0             1          2        3         4
//
//
//        //how do you read each individual city/element
//        System.out.println(cities[0]);
//        System.out.println(cities[1]);
//        System.out.println(cities[2]);
//        System.out.println(cities[3]);
//        System.out.println(cities[4]);
//
//        // How do we know the number of elements
//        System.out.println(cities.length);
//
//        // How do we print the whole array
//        System.out.println(cities ); // this doesn't give us a value
//        System.out.println(Arrays.toString(cities));

        int [] nums = {5,2,4,5,4,7,8}; // nums[0]
          //           0 1 2 3 4 5 6

        int[] nums2 = new int[5];
        int count = 0;

//        int dovzuna = nums.length;
//        int index1 = nums[1];



        for (int i = 1; i < nums.length; i++) {
            if(nums[0] < nums[i]){ //7
               nums2[count++] = nums[i];
            }
        }

        System.out.println(Arrays.toString(nums2));



    }
}
