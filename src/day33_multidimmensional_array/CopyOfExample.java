package day33_multidimmensional_array;

import java.util.Arrays;

public class CopyOfExample {
    public static void main(String[] args) {

        int [] a = { 1, 2, 3};
        int [] b = a;

        a [0] = 100;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        System.out.println();

        int [] c = { 20, 30, 40};
        int [] d = Arrays.copyOf(c,c.length);
        int [] e = Arrays.copyOf(c, 2);
        c[0] = 200;

        // copy method allows us to resize the array
        // creates a new object

        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(e));
    }
}
