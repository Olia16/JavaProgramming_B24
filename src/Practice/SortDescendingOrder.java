package Practice;

import java.util.Arrays;

public class SortDescendingOrder {

    public static void main(String[] args) {
        int [] arr = {1, 5, 0 , 8 , 7};
        System.out.println(Arrays.toString(descendingOrder(arr)));
    }

    public static int [] descendingOrder(int [] arr){ // creating return method that accepts int [array] and returns int []

        for(int i = 0; i < arr.length;i++){ // will use traditional nested loops to check each num and to sort them accordingly, first loop will start from 0
            for(int j = i + 1; j < arr.length; j++){
                // inner loop will start from i + 1;
                // so basically we want to have inner loop variable always next to outer loop variable
                int container = 0; // create container, so we can store our number and later store it to the right position;
                if(arr[i] < arr[j]){ // if true we store smaller num to container->
                    container = arr[i];
                    arr[i] = arr[j];// storing bigger num is position of smaller num
                    arr[j] = container; // storing smaller num in position of bigger, using our variable container
                }

            }
        }
        return arr; // returning an array

    }
}
