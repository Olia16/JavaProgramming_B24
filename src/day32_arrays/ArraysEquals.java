package day32_arrays;

import java.util.Arrays;

public class ArraysEquals {
    public static void main(String[] args) {
        int [] a = {1, 2, 3};
        int [] b = {1, 2, 3};
        int [] c = {3, 2, 1};
        int [] d = {3, 2, 1,0};

        System.out.println(Arrays.equals(a,b)); // true
        System.out.println(Arrays.equals(a,c)); // false
        System.out.println(Arrays.equals(c,d)); // false

        Arrays.sort(c);
        System.out.println(Arrays.equals(a,c)); // true
    }
}
