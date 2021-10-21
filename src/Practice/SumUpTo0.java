package Practice;

import java.util.Arrays;

public class SumUpTo0 {

    public static int[] sumUpTo0(int n) {

        int[] result = new int[n];

        int sum = 0;
        for (int i = 0; i < result.length-1; i++) {
            result[i] = i;
            System.out.println(i);
            sum += i;
        }
        result[n - 1] = -sum;
        return result;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumUpTo0(5)));
    }
}
