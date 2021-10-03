package day37_methods;

import my_utilities.ArraysUtil;

public class UsingArrayClass {
    public static void main(String[] args) {
        int [] a = {4, 5, 4, 9, 7, 5, 299};

        System.out.println(ArraysUtil.maxNumber(a));
        System.out.println(ArraysUtil.minNumber(a));


        System.out.println(ArraysUtil.contains(a, 50));
        System.out.println(ArraysUtil.contains(a, 5));
    }
}
