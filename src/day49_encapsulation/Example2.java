package day49_encapsulation;

import static java.util.Arrays.*; // importing all static members
import static java.lang.Math.*;
import java.util.Arrays;

public class Example2 {

    public static void main(String[] args) {

        int [] a = {1, 3, 4, 7, 5};

        //same thing but when importing static class no need to type Arrays
        Arrays.sort(a);
        sort(a);

        System.out.println(Arrays.toString(a));

        // no need to type Math. when importing static java.lang.Math*
        System.out.println(Math.PI);
        System.out.println(PI);



    }
}
