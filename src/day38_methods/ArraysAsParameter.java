package day38_methods;

import java.util.Arrays;

public class ArraysAsParameter {
    public static void main(String[] args) {

        int [] a = {1, 2, 5, 4, 4, 5};
        printArray(a);

    }
    public static void printArray(int [] arr){
        for(int each : arr){
            System.out.println(each);

        }
    }
}
