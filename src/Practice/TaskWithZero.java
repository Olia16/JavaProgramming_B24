package Practice;

import java.util.Arrays;

public class TaskWithZero {

    //move zero to the end

    public static void main(String[] args) {
        int [] arr ={1 ,5 , 0, 0 , 1};
        System.out.println(Arrays.toString(moveZeros(arr)));

    }

    public static int[] moveZeros(int[] arr) { // create method that accepts int [] and returns int []
        int[] sortedArray = new int[arr.length]; // created new arr to store sorted values, size same as length of given parameter

        int c = 0; // count that will increment with each iteration and go to next position where variable should be stored
        for (int i = 0; i < arr.length; i++) {// create traditional loop to loop thru each number in given arr
            if (arr[i] > 0) { // if statement will check if each num > 0 ->
                sortedArray[c++] = arr[i]; // -> then I want to store number > 0 to my new arr
            }
        }
        return sortedArray;
    }
}


