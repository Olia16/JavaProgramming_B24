package day33_multidimmensional_array;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {

        int [] nums = { 1, 55, 100, 200};
        System.out.println(Arrays.binarySearch(nums,55));
        System.out.println(Arrays.binarySearch(nums,200));
        System.out.println(Arrays.binarySearch(nums,300)); // gives negative of pos where it would be in array + 1
        System.out.println(Arrays.binarySearch(nums,0));  // gives negative of pos where it would be in array + 1
        System.out.println(Arrays.binarySearch(nums,60));

        System.out.println();

        int [] notSorted = { 49, 30, 2, 1, 60, 23};
        System.out.println(Arrays.binarySearch(notSorted, 30)); // can give index of 30 if NOT SORTED!
        // MUST BE SORTED! in order to give correct index
        Arrays.sort(notSorted);
        System.out.println(Arrays.toString(notSorted));
        System.out.println(Arrays.binarySearch(notSorted, 30));

        System.out.println();

        int [] negatives = {-5, -3, -2, 10, 20 };
        int indexOfNeg = Arrays.binarySearch(negatives, -5);
        System.out.println(indexOfNeg);

    }
}
