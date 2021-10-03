package day32_arrays;

import java.util.Arrays;

public class StringSortArray {
    public static void main(String[] args) {
        String [] strs = {"java", "8eight", "Hello", "hello", "HEllo", "$dollar", " ", "$$apples"};
        Arrays.sort(strs);

        System.out.println(Arrays.toString(strs));
    }
}
